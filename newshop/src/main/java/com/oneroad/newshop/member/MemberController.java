package com.oneroad.newshop.member;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class MemberController {
    private final OnememberRepository onememberRepository;

    private final MemberRepository memberRepository;

    @GetMapping("/register")
    String register() {
        return "register.html";
    }

    @GetMapping("/oneregister")
    String oneregister() {
        return "oneregister.html";
    }

    @GetMapping("/")
    String testoneregister() {
        return "oneregister.html";
    }


    @PostMapping("/member")
    String register(String displayName,
                    String username,
                    String password) {
        Member member = new Member();
        member.setUsername(username);
        var hash = new BCryptPasswordEncoder().encode(password);
        member.setPassword(hash);
        member.setDisplayName(displayName);
        memberRepository.save(member);
        return "redirect:/list";
        }

        @PostMapping("/onemember")
        String oneroadMember(String name, String number, String phone){
            OneroadMember onemember = new OneroadMember();
            onemember.setName(name);
            onemember.setNumber(number);
            onemember.setPhone(phone);
            onememberRepository.save(onemember);

            return "redirect:/list";
        }

}


