package com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.p2973a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.api.DislikeReasonApi;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.g */
public final class C50359g extends AbstractC39085b<String> {
    static {
        Covode.recordClassIndex(59487);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.g$a */
    static final class CallableC50360a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ Object[] f116289a;

        static {
            Covode.recordClassIndex(59488);
        }

        CallableC50360a(Object[] objArr) {
            this.f116289a = objArr;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.HashMap */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.Callable
        public final Object call() {
            Object[] objArr = this.f116289a;
            Object obj = objArr[0];
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
            Aweme aweme = (Aweme) obj;
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = "";
            if (aweme == null) {
                return str;
            }
            Map<String, String> hashMap = new HashMap<>();
            hashMap.put("dislike_reason_id", obj2);
            if (aweme.getMusic() != null) {
                str = aweme.getMusic().getMid();
            }
            hashMap.put("music_id", str);
            hashMap.put("author_id", aweme.getAuthorUid());
            DislikeReasonApi.f116317a.disLikeReason(hashMap).execute();
            return obj2;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean checkParams(Object... objArr) {
        C89219l.m154721d(objArr, "");
        if (objArr.length == 2) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean sendRequest(Object... objArr) {
        C89219l.m154721d(objArr, "");
        if (!super.sendRequest(Arrays.copyOf(objArr, objArr.length))) {
            return false;
        }
        C34608n.m70658a().mo61083a(this.mHandler, new CallableC50360a(objArr), 0);
        return true;
    }
}
