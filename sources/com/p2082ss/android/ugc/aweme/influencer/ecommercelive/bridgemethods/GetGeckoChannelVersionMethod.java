package com.p2082ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.utils.C15064m;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.web.C81631k;
import java.io.File;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods.GetGeckoChannelVersionMethod */
public final class GetGeckoChannelVersionMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C56604a f129036b = new C56604a((byte) 0);

    /* renamed from: c */
    private final String f129037c = "getGeckoChannelVersion";

    static {
        Covode.recordClassIndex(66441);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods.GetGeckoChannelVersionMethod$a */
    public static final class C56604a {
        static {
            Covode.recordClassIndex(66442);
        }

        private C56604a() {
        }

        public /* synthetic */ C56604a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f129037c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetGeckoChannelVersionMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        try {
            String optString = jSONObject.optString("channel");
            C89219l.m154716b(optString, "");
            if (C89361p.m154908a((CharSequence) optString, (CharSequence) "../", false)) {
                aVar.mo61871a(-1, "channel is wrong, should not contain ../");
                return;
            }
            File b = C81631k.m141476b();
            C81631k kVar = C81631k.f182525a;
            C89219l.m154716b(kVar, "");
            String c = kVar.mo125297c();
            C89219l.m154716b(c, "");
            C89219l.m154721d(c, "");
            C89219l.m154721d(optString, "");
            if (!TextUtils.isEmpty(c) && !TextUtils.isEmpty(optString) && b.exists()) {
                if (b.isDirectory()) {
                    File file = new File(b, File.separator + c);
                    if (file.exists()) {
                        File file2 = new File(file.getAbsolutePath(), optString);
                        if (file2.exists()) {
                            Long a = C15064m.m27738a(file2);
                            if (a != null) {
                                aVar.mo61873a(Long.valueOf(a.longValue()), 0, "success");
                                return;
                            }
                        }
                    }
                }
            }
            aVar.mo61871a(-1, "GeckoxVersion is null, may have no file");
        } catch (Exception e) {
            aVar.mo61871a(-1, e.getMessage());
            e.printStackTrace();
            C51423a.m95788a("getGeckoChannelVersion", e);
        }
    }
}
