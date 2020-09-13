package com.strongprogrammer.architecture.hexagonal.notifier;

import com.strongprogrammer.architecture.hexagonal.app.service.NotifierService;

/**
 * @author Thanos Floros (thanosfloros@strong-programmer.com)
 */
public class NotifierServiceImpl implements NotifierService {
    @Override
    public void emailSend() {
        System.out.println("Send email here");
    }

    @Override
    public void smsSend() {
        System.out.println("Send SMS here");
    }
}
