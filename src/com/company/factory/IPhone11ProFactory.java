package com.company.factory;

import com.company.model.IPhone11Pro;
import com.company.model.IPhone;

public class IPhone11ProFactory extends IPhoneFactory {

    public IPhone createIPhone() {
        return new IPhone11Pro();
    }

}
