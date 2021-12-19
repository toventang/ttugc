package com.p2082ss.android.ugc.aweme.comment.p2496j;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.comment.p2499m.C36542d;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import java.util.Arrays;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.j.b */
public abstract class AbstractC36503b<T> extends AbstractC39085b<T> {

    /* renamed from: a */
    public final C36542d f86430a = new C36542d();

    static {
        Covode.recordClassIndex(43806);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public void handleData(T t) {
        super.handleData(t);
        if (t instanceof BaseResponse) {
            this.f86430a.mo64008a(t);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public boolean sendRequest(Object... objArr) {
        C89219l.m154721d(objArr, "");
        this.f86430a.mo64007a();
        if (!super.sendRequest(Arrays.copyOf(objArr, objArr.length))) {
            return false;
        }
        return true;
    }
}
