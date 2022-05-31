package ru.skillfactory.final_app.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import ru.skillfactory.final_app.entity.Balance;
import ru.skillfactory.final_app.service.BalanceService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/balance/")
public class BalanceRestController {
    @Autowired
    private BalanceService balanceService;
    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Balance> getBalance(@PathVariable("id") Long balanceId){
        if (balanceId == null){
            return new ResponseEntity<Balance>(HttpStatus.BAD_REQUEST);
        }
        Optional<Balance> balance = this.balanceService.getBalance(balanceId);
        //if (balance == null){
          //  return ResponseEntity<Balance>(HttpStatus.NOT_FOUND);
       // }

        return new ResponseEntity<>(balance.get(), HttpStatus.OK);
    }
}
