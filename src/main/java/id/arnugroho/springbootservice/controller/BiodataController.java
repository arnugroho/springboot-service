package id.arnugroho.springbootservice.controller;

import id.arnugroho.springbootservice.model.dto.BiodataDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import id.arnugroho.springbootservice.model.DefaultResponse;

import java.util.Date;

@RestController
@RequestMapping("/biodata")
public class BiodataController {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @GetMapping("/get")
    public DefaultResponse<BiodataDto> getBiodata() {
        log.info("get biodata : " + new Date());
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
        b.setNama(biodataDto.getNama());
        b.setAlamat(biodataDto.getAlamat());
        return DefaultResponse.ok(b);
    }
}
