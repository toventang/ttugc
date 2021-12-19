package com.p2082ss.android.ugc.aweme.friends.p3022ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.friends.model.RecommendContact;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.x */
public abstract class AbstractC51755x extends RelativeLayout {

    /* renamed from: a */
    private String f119284a = "";

    static {
        Covode.recordClassIndex(61118);
    }

    /* renamed from: a */
    public abstract void mo87418a(RecommendContact recommendContact, int i);

    public abstract void setDislikeListener(AbstractC89183m<? super RecommendContact, ? super Integer, C89391z> mVar);

    public final String getEnterFrom() {
        return this.f119284a;
    }

    public final void setEnterFrom(String str) {
        this.f119284a = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC51755x(Context context, AttributeSet attributeSet, int i) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
    }
}
