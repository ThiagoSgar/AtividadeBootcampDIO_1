package projeto.bootcamp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projeto.bootcamp.modelo.JornadaDeTrabalho;
import projeto.bootcamp.Service.JornadaDeTrabalhoService;

import java.util.NoSuchElementException;

import java.util.List;

@RestController
@RequestMapping("/jornada")
public class JornadaDeTrabalhoController {

    @Autowired
    JornadaDeTrabalhoService jornadaDeTrabalhoService;

    @PostMapping
    public JornadaDeTrabalho createJornada(@RequestBody JornadaDeTrabalho jornadaDeTrabalho){
        return jornadaDeTrabalhoService.saveJornada(jornadaDeTrabalho);
    }
    @GetMapping
    public List<JornadaDeTrabalho> getJornadaList(){
        return jornadaDeTrabalhoService.findAll();
    }
    @GetMapping("/{idJornada}")
    public ResponseEntity<JornadaDeTrabalho>  getJornadaById(@PathVariable("idJornada") Long idJornada) throws Exception {
        return ResponseEntity.ok(jornadaDeTrabalhoService.getById(idJornada).orElseThrow(() -> new NoSuchElementException("Not Found")));
    }
    @PutMapping
    public JornadaDeTrabalho updateJornada(@RequestBody JornadaDeTrabalho jornadaDeTrabalho){
        return jornadaDeTrabalhoService.updateJornada(jornadaDeTrabalho);
    }
    @DeleteMapping("/{idJornada}")
    public ResponseEntity delete(@PathVariable("idJornada") Long idJornada) throws Exception {
        try {
            jornadaDeTrabalhoService.delete(idJornada);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<JornadaDeTrabalho>) ResponseEntity.ok();
    }
}
