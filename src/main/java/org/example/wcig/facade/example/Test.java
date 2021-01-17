package org.example.wcig.facade.example;

public class Test {
    public static void main(String[] args) {
        Company c = new Facade().openCompany("google");
    }
}

class Facade {
    public Company openCompany(String name) {
        Company c = new AdminOfIndustry().register(name);
        new Bank().openAccount(c.getId());
        new Taxation().applyTaxCode(c.getId());
        return c;
    }
}

class Company {
    private String name;
    private String id;

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }
}

// 工商注册:
class AdminOfIndustry {
    public Company register(String name) {
        // 注册操作..
        Company c = new Company(name);
        c.setId("001");
        return c;
    }
}

// 银行开户:
class Bank {
    public void openAccount(String companyId) {
        // ...
    }
}

// 纳税登记:
class Taxation {
    public void applyTaxCode(String companyId) {
        // ...
    }
}
