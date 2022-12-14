package com.red.controller;

import com.red.controller.utils.Result;
import com.red.dto.UserSkillDTO;
import com.red.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/skills")
public class SkillController {
    @Autowired
    private SkillService skillService;

    @GetMapping("/{userId}")
    public Result getUserSkill(@PathVariable Long userId) {
        return skillService.getUserSkill(userId);
    }


    /**
     * 添加用户技术
     *
     * @param userSkillDto 包含userid和skill
     * @return Result
     */
    @PostMapping("/addUserSkill")
    public Result addUserSkill(@RequestBody UserSkillDTO userSkillDto) {
        return skillService.addUserSkill(userSkillDto);
    }

}
