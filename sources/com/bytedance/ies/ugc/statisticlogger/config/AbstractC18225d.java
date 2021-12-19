package com.bytedance.ies.ugc.statisticlogger.config;

import android.app.Application;
import com.bytedance.common.utility.AbstractC13621j;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.ugc.statisticlogger.config.d */
public abstract class AbstractC18225d {

    /* renamed from: a */
    public final Application f43415a;

    /* renamed from: com.bytedance.ies.ugc.statisticlogger.config.d$a */
    public interface AbstractC18226a {
        static {
            Covode.recordClassIndex(20885);
        }

        /* renamed from: a */
        AbstractC13621j mo29088a();
    }

    static {
        Covode.recordClassIndex(20884);
    }

    /* renamed from: a */
    public abstract AbstractC18226a mo29086a();

    /* renamed from: b */
    public abstract boolean mo29087b();

    public AbstractC18225d(Application application) {
        C89219l.m154721d(application, "");
        this.f43415a = application;
    }
}
