package id.arnugroho.springbootservice.controller;

import id.arnugroho.springbootservice.model.dto.BiodataDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import id.arnugroho.springbootservice.model.DefaultResponse;

@RestController
@RequestMapping("/biodata")
public class BiodataController {
    @GetMapping("/get")
    public DefaultResponse<BiodataDto> getBiodata() {
        BiodataDto biodataDto = new BiodataDto();
        biodataDto.setNama("akbar");
        biodataDto.setAlamat("bogor");
        return DefaultResponse.ok(biodataDto);
    }

    @GetMapping("/geterror")
    public DefaultResponse<BiodataDto> getBiodataError() {
        return DefaultResponse.error("Data sudah ada");
    }
}
