package com.origin.liubojin.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.RequestScope;

/**
 * @author liubojin
 * Created on 2018/4/13
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    //    private final AppointmentBook appointmentBook;
//
//    @Autowired
//    public AppointmentsController(AppointmentBook appointmentBook) {
//        this.appointmentBook = appointmentBook;
//    }
//
//    @RequestMapping(method = RequestMethod.GET)
//    public Map<String, Appointment> get() {
//        return appointmentBook.getAppointmentsForToday();
//    }
//
//    @RequestMapping(path = "/{day}", method = RequestMethod.GET)
//    public Map<String, Appointment> getForDay(@PathVariable @DateTimeFormat(iso= DateTimeFormat.ISO.DATE) Date day, Model model) {
//        return appointmentBook.getAppointmentsForDay(day);
//    }
//
//    @RequestMapping(path = "/new", method = RequestMethod.GET)
//    public AppointmentForm getNewForm() {
//        return new AppointmentForm();
//    }
//
//    @RequestMapping(method = RequestMethod.POST)
//    public String add(@Valid AppointmentForm appointment, BindingResult result) {
//        if (result.hasErrors()) {
//            return "appointments/new";
//        }
//        appointmentBook.addAppointment(appointment);
//        return "redirect:/appointments";
//    }
    /**
     * @return 跳转首页
     */
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String toIndex() {
        return "/index";
    }


    @RequestMapping(value = "/timeLine",method = RequestMethod.GET)
    public String timeLineDemo() {
        return "/timeLine";
    }
}