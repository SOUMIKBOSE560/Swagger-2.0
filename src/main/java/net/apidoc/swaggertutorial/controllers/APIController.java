package net.apidoc.swaggertutorial.controllers;


import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/test")
public class APIController {

    @Operation(
            tags = "Demo-Tag",
            description = "This is a demo description",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "success"
                    ),

                    @ApiResponse(
                            responseCode = "500",
                            description = "internal error"
                    ),

                    @ApiResponse(
                            responseCode = "400",
                            description = "error"
                    )
            }

    )
    @GetMapping("/getalldata")
    public List<String> getData(){
        List<String> list = new ArrayList<>();
        list.add("vincent");
        list.add("crax");
        list.add("jaxon");
        return list;
    }

    @PutMapping("/edit/{data}")
    public List<String> editData(@PathVariable String data){
        List<String > list = new ArrayList<>();
        list.add("data added : " + data);
        return list;
    }

    @PostMapping("/create/{n}")
    public List<String> createList(@PathVariable int n){
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add("Added : " + i + 1);
        }
        return list;
    }

    @Hidden
    @DeleteMapping("/delete/{data}")
    public List<String> deleteData(@PathVariable String data){
        List<String> list = new ArrayList<>();
        list.add("zoom");list.add("flash");list.add("delta");
        list.remove(data);
        return list;
    }
}
