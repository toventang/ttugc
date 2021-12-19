package com.p2082ss.android.ugc.aweme.effectplatform;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27252o;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63190ap;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.r */
public final class C46432r implements IFetchCategoryEffectListener {

    /* renamed from: f */
    public static final C46433a f108190f = new C46433a((byte) 0);

    /* renamed from: a */
    public Map<String, ? extends Object> f108191a;

    /* renamed from: b */
    public final String f108192b;

    /* renamed from: c */
    public final int f108193c;

    /* renamed from: d */
    public final int f108194d;

    /* renamed from: e */
    public final IFetchCategoryEffectListener f108195e;

    /* renamed from: g */
    private final C27252o f108196g;

    static {
        Covode.recordClassIndex(55013);
    }

    /* renamed from: com.ss.android.ugc.aweme.effectplatform.r$a */
    public static final class C46433a {
        static {
            Covode.recordClassIndex(55014);
        }

        private C46433a() {
        }

        public /* synthetic */ C46433a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C46432r m89595a(String str, int i, int i2, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(iFetchCategoryEffectListener, "");
            return new C46432r(str, i, i2, new C46418i(str, iFetchCategoryEffectListener), (byte) 0);
        }
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
    public final void onFail(ExceptionResult exceptionResult) {
        int errorCode;
        String msg;
        Object obj;
        int i;
        if (exceptionResult == null) {
            errorCode = -2;
            msg = "unknown error";
        } else {
            errorCode = exceptionResult.getErrorCode();
            msg = exceptionResult.getMsg();
            C89219l.m154716b(msg, "");
        }
        AbstractC63190ap I = C63244g.m114602a().mo73263I();
        C69840ar a = new C69840ar().mo110187a("errorCode", Integer.valueOf(errorCode)).mo110189a("errorDesc", msg).mo110187a("count", Integer.valueOf(this.f108193c)).mo110187a("cursor", Integer.valueOf(this.f108194d)).mo110189a("panel", this.f108192b);
        Map<String, ? extends Object> map = this.f108191a;
        Integer num = null;
        if (map != null) {
            obj = map.get("is_story");
        } else {
            obj = null;
        }
        if (obj instanceof Integer) {
            num = obj;
        }
        Integer num2 = num;
        if (num2 != null) {
            i = num2.intValue();
        } else {
            i = 0;
        }
        I.mo101629a("sticker_list_error_rate", 1, a.mo110187a("is_story", Integer.valueOf(i)).mo110191a());
        IFetchCategoryEffectListener iFetchCategoryEffectListener = this.f108195e;
        if (iFetchCategoryEffectListener != null) {
            iFetchCategoryEffectListener.onFail(exceptionResult);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final /* synthetic */ void onSuccess(CategoryPageModel categoryPageModel) {
        Object obj;
        int i;
        long a = this.f108196g.mo45339a(TimeUnit.MILLISECONDS);
        IFetchCategoryEffectListener iFetchCategoryEffectListener = this.f108195e;
        if (iFetchCategoryEffectListener != null) {
            iFetchCategoryEffectListener.onSuccess(categoryPageModel);
        }
        C69840ar a2 = new C69840ar().mo110188a("duration", Long.valueOf(a)).mo110187a("abParam", (Integer) 2).mo110187a("count", Integer.valueOf(this.f108193c)).mo110187a("cursor", Integer.valueOf(this.f108194d)).mo110189a("panel", this.f108192b);
        Map<String, ? extends Object> map = this.f108191a;
        Integer num = null;
        if (map != null) {
            obj = map.get("is_story");
        } else {
            obj = null;
        }
        if (obj instanceof Integer) {
            num = obj;
        }
        Integer num2 = num;
        if (num2 != null) {
            i = num2.intValue();
        } else {
            i = 0;
        }
        C63244g.m114602a().mo73263I().mo101629a("sticker_list_error_rate", 0, a2.mo110187a("is_story", Integer.valueOf(i)).mo110191a());
    }

    private C46432r(String str, int i, int i2, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
        this.f108192b = str;
        this.f108193c = i;
        this.f108194d = i2;
        this.f108195e = iFetchCategoryEffectListener;
        C27252o a = C27252o.m54253a();
        C89219l.m154716b(a, "");
        this.f108196g = a;
    }

    public /* synthetic */ C46432r(String str, int i, int i2, IFetchCategoryEffectListener iFetchCategoryEffectListener, byte b) {
        this(str, i, i2, iFetchCategoryEffectListener);
    }
}
