package com.zhihu.matisse.internal.entity;

import com.bytedance.covode.number.Covode;
import com.zhihu.matisse.EnumC87938b;
import com.zhihu.matisse.p4511a.AbstractC87937a;
import com.zhihu.matisse.p4512b.AbstractC87939a;
import com.zhihu.matisse.p4512b.AbstractC87941c;
import java.util.List;
import java.util.Set;

/* renamed from: com.zhihu.matisse.internal.entity.c */
public final class C87956c {

    /* renamed from: a */
    public Set<EnumC87938b> f199747a;

    /* renamed from: b */
    public boolean f199748b;

    /* renamed from: c */
    public boolean f199749c;

    /* renamed from: d */
    public int f199750d;

    /* renamed from: e */
    public int f199751e;

    /* renamed from: f */
    public boolean f199752f;

    /* renamed from: g */
    public int f199753g;

    /* renamed from: h */
    public int f199754h;

    /* renamed from: i */
    public int f199755i;

    /* renamed from: j */
    public List<AbstractC87937a> f199756j;

    /* renamed from: k */
    public boolean f199757k;

    /* renamed from: l */
    public C87954a f199758l;

    /* renamed from: m */
    public int f199759m;

    /* renamed from: n */
    public int f199760n;

    /* renamed from: o */
    public float f199761o;

    /* renamed from: p */
    public boolean f199762p;

    /* renamed from: q */
    public AbstractC87941c f199763q;

    /* renamed from: r */
    public boolean f199764r;

    /* renamed from: s */
    public boolean f199765s;

    /* renamed from: t */
    public int f199766t;

    /* renamed from: u */
    public AbstractC87939a f199767u;

    static {
        Covode.recordClassIndex(103973);
    }

    private C87956c() {
    }

    /* renamed from: com.zhihu.matisse.internal.entity.c$a */
    public static final class C87957a {

        /* renamed from: a */
        public static final C87956c f199768a = new C87956c((byte) 0);

        static {
            Covode.recordClassIndex(103974);
        }
    }

    /* renamed from: b */
    public final boolean mo142484b() {
        if (this.f199751e != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo142483a() {
        if (this.f199752f) {
            return false;
        }
        if (this.f199753g == 1 || (this.f199754h == 1 && this.f199755i == 1)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo142485c() {
        if (!this.f199749c || !EnumC87938b.ofImage().containsAll(this.f199747a)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final boolean mo142486d() {
        if (!this.f199749c || !EnumC87938b.ofVideo().containsAll(this.f199747a)) {
            return false;
        }
        return true;
    }

    /* synthetic */ C87956c(byte b) {
        this();
    }
}
