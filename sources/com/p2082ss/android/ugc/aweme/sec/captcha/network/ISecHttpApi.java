package com.p2082ss.android.ugc.aweme.sec.captcha.network;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.p1610b.AbstractC21993ag;
import com.bytedance.retrofit2.p1610b.AbstractC21994b;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22004l;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import java.util.List;
import okhttp3.AbstractC90025ab;

/* renamed from: com.ss.android.ugc.aweme.sec.captcha.network.ISecHttpApi */
public interface ISecHttpApi {

    /* renamed from: a */
    public static final C67825a f152020a = C67825a.f152021a;

    static {
        Covode.recordClassIndex(79485);
    }

    @AbstractC22000h
    AbstractC21983b<TypedInput> request(@AbstractC21993ag String str, @AbstractC22004l List<C22027b> list);

    @AbstractC22012t
    AbstractC21983b<TypedInput> request(@AbstractC21993ag String str, @AbstractC22004l List<C22027b> list, @AbstractC21994b AbstractC90025ab abVar);

    /* renamed from: com.ss.android.ugc.aweme.sec.captcha.network.ISecHttpApi$a */
    public static final class C67825a {

        /* renamed from: a */
        static final /* synthetic */ C67825a f152021a = new C67825a();

        private C67825a() {
        }

        static {
            Covode.recordClassIndex(79486);
        }
    }
}
