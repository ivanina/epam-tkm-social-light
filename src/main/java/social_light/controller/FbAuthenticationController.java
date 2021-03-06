package social_light.controller;

import social_light.entity.domain.FbUser;
import social_light.entity.domain.TestTable;
import social_light.repository.manager.FbUserRepository;
import social_light.repository.manager.TestTableRepository;
import social_light.service.fb.FbUserService;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

import java.util.Date;
import java.util.List;

@Transactional
@RestController
@RequestMapping("api/fb/authentication")
public class FbAuthenticationController {

    @Inject
    private FbUserService fbUserService;

    /*@Inject
    FbUserRepository fbUserRepository;*/

    @Inject
    TestTableRepository testTableRepository;


    @Transactional
    @RequestMapping(method = RequestMethod.GET)
    FbUser getCurrentFbUser(){

        /*List<FbUser> uL = (List<FbUser>) fbUserRepository.findAll();
        FbUser u2 = fbUserRepository.findByFbIdIs(1001L);
        if(u2 == null){
            u2 = new FbUser(1001L,"auto-test");
        }
        //u2.setKeywords("[\"test\",\"dev\"]");
        u2.setFirstName("TestName-2");
        u2 = fbUserRepository.save(u2);*/

        TestTable tt = testTableRepository.findOne(1L);
        if(tt == null) tt = new TestTable("New Name 2",new Date().toString());
        tt = testTableRepository.save(tt);


        FbUser fbCurrentUser = fbUserService.getAuthenticatedFbUser();
        if(fbCurrentUser == null){
            fbCurrentUser = new FbUser();
        }

        return fbCurrentUser;
    }

}
