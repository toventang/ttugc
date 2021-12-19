package com.p2082ss.android.ugc.aweme.compliance.business.banappeal.viewmodel;

import android.content.Context;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.compliance.api.model.AppealStatusResponse;
import com.p2082ss.android.ugc.aweme.compliance.business.banappeal.p2645c.AbstractC39336b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.viewmodel.AppealDialogViewModel */
public abstract class AppealDialogViewModel<T extends AbstractC39336b> extends AbstractC1174ac {

    /* renamed from: e */
    public static final C39351a f92886e = new C39351a((byte) 0);

    /* renamed from: a */
    private final Context f92887a;

    /* renamed from: c */
    public final C1213t<T> f92888c = new C1213t<>();

    /* renamed from: d */
    public final AppealStatusResponse f92889d;

    static {
        Covode.recordClassIndex(47033);
    }

    /* renamed from: a */
    public abstract T mo68790a(AppealStatusResponse appealStatusResponse);

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.viewmodel.AppealDialogViewModel$a */
    public static final class C39351a {
        static {
            Covode.recordClassIndex(47034);
        }

        private C39351a() {
        }

        public /* synthetic */ C39351a(byte b) {
            this();
        }
    }

    public AppealDialogViewModel(Context context, AppealStatusResponse appealStatusResponse) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(appealStatusResponse, "");
        this.f92887a = context;
        this.f92889d = appealStatusResponse;
    }
}
