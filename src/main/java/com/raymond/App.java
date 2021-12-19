package com.raymond;

import com.raymond.inter.ICuenta;
import com.raymond.model.Cuenta;
import com.raymond.proxy.CuentaProxy;

public class App {

    public static void main(String[] args) {
        Cuenta c=new Cuenta(1, "Raymond", 1000000000);

        ICuenta cuentaProxy=new CuentaProxy();
        cuentaProxy.mostrarSaldo(c);
        c=cuentaProxy.depositarDinero(c, 5000000);
        c=cuentaProxy.retirarDinero(c, 20000000);
        cuentaProxy.mostrarSaldo(c);
    }
}
