package com.company.factory;

import com.company.model.IPhone11;
import com.company.model.IPhone;


public class IPhone11Factory extends IPhoneFactory {

    public IPhone createIPhone() {
        return new IPhone11();
    }

}
