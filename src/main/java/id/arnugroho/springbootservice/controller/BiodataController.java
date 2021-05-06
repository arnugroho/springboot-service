package id.arnugroho.springbootservice.controller;

import id.arnugroho.springbootservice.model.dto.BiodataDto;
import org.springframework.web.bind.annotation.*;
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
        return DefaultResponse.error("Data diri sudah ada di aplikasi");
    }

    @PostMapping("/save")
    public DefaultResponse<BiodataDto> saveBiodata(@RequestBody BiodataDto biodataDto) {
        BiodataDto b = new BiodataDto();
        biodataDto.setNama(biodataDto.getNama());
        biodataDto.setAlamat(biodataDto.getAlamat());
        return DefaultResponse.ok(b);
    }
}
