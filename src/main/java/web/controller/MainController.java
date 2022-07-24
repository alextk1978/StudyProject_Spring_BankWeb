package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import web.model.DebitCard;
import web.model.Loan;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class MainController {
    List <Loan> loans = new ArrayList<>();
    List <DebitCard> cards = new ArrayList<>();

    @GetMapping("/")
    public String mainPage(){
        return "/firstView";
    }

    @GetMapping("/cards")
    public String cardsPage(Model model){

        model.addAttribute("cardsList", cards);
        return "/cardView";
    }

    @GetMapping("/loans")
    public String loansPage(Model model){

        model.addAttribute("loansList", loans);
        return "/loanView";
    }

    @GetMapping("/newCard")
    public String newCard(Model model) {

        model.addAttribute("debitCard", new DebitCard());
        return "/newCardView";
    }

    @GetMapping("/newLoan")
    public String newLoan(Model model) {

        model.addAttribute(new Loan());
        return "/newLoanView";
    }

    @PostMapping("/newCard")
    public String addCard(@ModelAttribute("debitCard") DebitCard newCard) {

        newCard.setCurrentBalance(100);
        String userNumber = generateCardNumber();
        newCard.setCardNumber(userNumber);
        int userCvv = generateCvv();
        newCard.setCvv(userCvv);

        cards.add(newCard);

        return "redirect:/cards";
    }

    public int generateCvv(){
        Random random = new Random();
        return random.nextInt(888)+111;
    }

    public String generateCardNumber(){
        Random random = new Random();
        int part1 = random.nextInt(88888888)+11111111;
        int part2 = random.nextInt(88888888)+11111111;
        String text1 = Integer.toString(part1);
        String text2 = Integer.toString(part2);

        return text1 + text2;
    }

}
