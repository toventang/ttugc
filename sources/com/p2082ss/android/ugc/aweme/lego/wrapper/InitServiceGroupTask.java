package com.p2082ss.android.ugc.aweme.lego.wrapper;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.lego.wrapper.InitServiceGroupTask */
public final class InitServiceGroupTask implements AbstractC58264w {

    /* renamed from: a */
    private final ArrayList<Runnable> f132699a;

    /* renamed from: b */
    private final int f132700b;

    /* renamed from: c */
    private final EnumC58151ae f132701c;

    static {
        Covode.recordClassIndex(68332);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return this.f132701c;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return this.f132700b;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    public /* synthetic */ InitServiceGroupTask(Runnable[] runnableArr) {
        this(runnableArr, EnumC58151ae.MAIN);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        for (T t : this.f132699a) {
            if (t != null) {
                t.run();
            }
        }
    }

    private InitServiceGroupTask(Runnable[] runnableArr, EnumC58151ae aeVar) {
        C89219l.m154721d(runnableArr, "");
        C89219l.m154721d(aeVar, "");
        this.f132699a = new ArrayList<>();
        this.f132700b = 1;
        this.f132701c = aeVar;
        for (Runnable runnable : runnableArr) {
            this.f132699a.add(runnable);
        }
    }
}
