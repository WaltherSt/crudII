package com.diego_dj_producciones.springbootdiego_dj_producciones.controller;

import com.diego_dj_producciones.springbootdiego_dj_producciones.models.Cliente;
import com.diego_dj_producciones.springbootdiego_dj_producciones.services.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.text.Normalizer;
import java.util.List;

@Controller
@RequestMapping("clientes")
public class ClientesController {
    @Autowired
    private final ClientesRepository clientesRepository;


    public ClientesController(ClientesRepository clientesRepository) {
        this.clientesRepository = clientesRepository;

    }

    @GetMapping
    public String getClientes(Model model) {
        List<Cliente> clientes = clientesRepository.findAll();
        model.addAttribute("clientes", clientes);
        return "clientes/index";
    }
    @GetMapping("/crear")
    public String showCreatePage(Model model) {
        return "clientes/crearcliente";
    }


    @PostMapping("/crear")
    public String addCliente(@ModelAttribute Cliente cliente){
        String nombreImagen = cliente.getTipo_evento();

        // Normalizar texto, eliminar tildes, convertir a minúsculas y eliminar espacios en blanco
        nombreImagen = Normalizer.normalize(nombreImagen, Normalizer.Form.NFD)
                .replaceAll("[^\\p{ASCII}]", "")
                .toLowerCase()
                .replaceAll("\\s","") + ".jpg";

        System.out.println(nombreImagen);

        cliente.setNombre_archivo_imagen(nombreImagen);
        clientesRepository.save(cliente);
        return "redirect:/clientes";
    }

    @GetMapping("/delete")
    public String deleteById(@RequestParam("id") Integer id){
        clientesRepository.deleteById(id);
        return "redirect:/clientes";
    }








}
