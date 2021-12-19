package com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4134d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.C78899d;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78851a;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78856e;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4132b.C78859b;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a.d.e */
public final class C78879e extends AbstractC78851a {

    /* renamed from: d */
    public String f177272d;

    static {
        Covode.recordClassIndex(92028);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a.d.e$a */
    public static final class C78880a implements IFetchEffectListener {

        /* renamed from: a */
        final /* synthetic */ C78879e f177273a;

        /* renamed from: b */
        final /* synthetic */ Object f177274b;

        static {
            Covode.recordClassIndex(92029);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onStart(Effect effect) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(Effect effect) {
            if (!this.f177273a.mo122709a(effect, this.f177274b)) {
                this.f177273a.mo122710b(this.f177274b);
            }
        }

        C78880a(C78879e eVar, Object obj) {
            this.f177273a = eVar;
            this.f177274b = obj;
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onFail(Effect effect, ExceptionResult exceptionResult) {
            C89219l.m154721d(exceptionResult, "");
            this.f177273a.mo122710b(this.f177274b);
        }
    }

    /* renamed from: b */
    public final void mo122710b(Object obj) {
        if (obj instanceof C78859b) {
            ((C78859b) obj).f177246c = !TextUtils.isEmpty(this.f177272d);
        }
        AbstractC78856e eVar = this.f177238a;
        if (eVar != null) {
            eVar.mo122701a(obj);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0081, code lost:
        if (r0 == null) goto L_0x0083;
     */
    @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78856e
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo122701a(java.lang.Object r5) {
        /*
        // Method dump skipped, instructions count: 143
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4134d.C78879e.mo122701a(java.lang.Object):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78879e(String str, C78859b bVar) {
        super(bVar);
        C89219l.m154721d(str, "");
        C89219l.m154721d(bVar, "");
        this.f177272d = str;
    }

    /* renamed from: a */
    public final boolean mo122709a(Effect effect, Object obj) {
        if (effect == null) {
            mo122710b(obj);
            return false;
        }
        ArrayList arrayList = new ArrayList();
        MvThemeData mvThemeData = new MvThemeData();
        mvThemeData.mo122666a(effect);
        arrayList.add(mvThemeData);
        long a = this.f177239b.mo122711a("fetch mv panel list", "success");
        C78899d dVar = this.f177240c.f177249f;
        if (dVar != null) {
            dVar.f177319b = (int) a;
        }
        this.f177240c.f177246c = false;
        AbstractC78856e eVar = this.f177238a;
        if (eVar == null) {
            return true;
        }
        eVar.mo122701a(arrayList);
        return true;
    }
}
