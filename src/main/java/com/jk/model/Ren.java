package com.jk.model;

import java.io.Serializable;

/**
 * Created by new鹏 on 2018/5/4.
 */
public class Ren implements Serializable {


    private static final long serialVersionUID = -2646427742760833040L;

    private Integer rid;

    private String rname;

    private String rpass;

    private Integer rtype;


    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname == null ? null : rname.trim();
    }

    public String getRpass() {
        return rpass;
    }

    public void setRpass(String rpass) {
        this.rpass = rpass == null ? null : rpass.trim();
    }

    public Integer getRtype() {
        return rtype;
    }

    public void setRtype(Integer rtype) {
        this.rtype = rtype;
    }

    @Override
    public String toString() {
        return "Ren [rid=" + rid + ", rname=" + rname + ", rpass=" + rpass
                + ", rtype=" + rtype + "]";
    }
}
