package com.p2082ss.android.ugc.aweme.commercialize.feed;

import android.text.TextUtils;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.ax */
public final class C37869ax {

    /* renamed from: a */
    static final AbstractC89244h f89371a = C89250i.m154773a((AbstractC89171a) C37871b.f89374a);

    /* renamed from: b */
    public static final C37869ax f89372b = new C37869ax();

    private C37869ax() {
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.ax$b */
    static final class C37871b extends AbstractC89220m implements AbstractC89171a<C0484a<String, Integer>> {

        /* renamed from: a */
        public static final C37871b f89374a = new C37871b();

        static {
            Covode.recordClassIndex(45323);
        }

        C37871b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C0484a<String, Integer> invoke() {
            return new C0484a();
        }
    }

    static {
        Covode.recordClassIndex(45321);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.ax$a */
    public static final class CallableC37870a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ List f89373a;

        static {
            Covode.recordClassIndex(45322);
        }

        public CallableC37870a(List list) {
            this.f89373a = list;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: androidx.c.a */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            for (Aweme aweme : this.f89373a) {
                if (aweme != null) {
                    C89219l.m154721d(aweme, "");
                    AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                    String str = null;
                    if (!TextUtils.isEmpty(awemeRawAd != null ? awemeRawAd.getLynxRawData() : null)) {
                        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                        if (awemeRawAd2 != null) {
                            str = awemeRawAd2.getLynxRawData();
                        }
                        str = new JSONObject(str).optString("star_sec_uid");
                    }
                    if (!TextUtils.isEmpty(str)) {
                        ((C0484a) C37869ax.f89371a.getValue()).put(str, 0);
                    }
                }
            }
            return C89391z.f203057a;
        }
    }
}
