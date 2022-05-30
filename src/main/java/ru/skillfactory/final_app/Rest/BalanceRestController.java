package ru.skillfactory.final_app.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
import ru.skillfactory.final_app.entity.Balance;
import ru.skillfactory.final_app.service.BalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

//import javax.validation.Valid;
import java.util.List;
import java.util.Optional;


@RequestMapping("/api/balance")
public class BalanceRestController {
    @Autowired
    private BalanceService balanceService;
    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Balance> getBalance(Long balanceId){
        if (balanceId == null){
            return new ResponseEntity<Balance>(HttpStatus.BAD_REQUEST);
        }
        Balance balance = this.balanceService.getBalance(balanceId);
        //if (balance == null){
          //  return ResponseEntity<Balance>(HttpStatus.NOT_FOUND);
       // }

        return new ResponseEntity<Balance>(balance, HttpStatus.OK);
    }
}
