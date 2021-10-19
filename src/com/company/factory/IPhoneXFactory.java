package com.company.factory;

import com.company.model.IPhoneX;
import com.company.model.IPhone;

public class IPhoneXFactory extends IPhoneFactory {

    public IPhone createIPhone() {
        return new IPhoneX();
    }

}
