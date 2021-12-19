package com.facebook.imagepipeline.p1889n;

import android.net.Uri;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1830b.C24065a;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1835g.AbstractC24113i;
import com.facebook.imagepipeline.p1885j.C24456e;
import com.facebook.imagepipeline.p1890o.C24636b;
import java.io.ByteArrayInputStream;

/* renamed from: com.facebook.imagepipeline.n.l */
public final class C24597l extends AbstractC24514aa {
    static {
        Covode.recordClassIndex(28741);
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.p1889n.AbstractC24514aa
    /* renamed from: a */
    public final String mo40382a() {
        return "DataFetchProducer";
    }

    public C24597l(AbstractC24113i iVar) {
        super(C24065a.f56998a, iVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.p1889n.AbstractC24514aa
    /* renamed from: a */
    public final C24456e mo40380a(C24636b bVar) {
        byte[] decode;
        MethodCollector.m26663i(5402);
        String uri = bVar.mSourceUri.toString();
        C24091i.m45620a(uri.substring(0, 5).equals("data:"));
        int indexOf = uri.indexOf(44);
        String substring = uri.substring(indexOf + 1, uri.length());
        String substring2 = uri.substring(0, indexOf);
        if (substring2.contains(";")) {
            String[] split = substring2.split(";");
            if (split[split.length - 1].equals("base64")) {
                decode = Base64.decode(substring, 0);
                C24456e a = mo40381a(new ByteArrayInputStream(decode), decode.length);
                MethodCollector.m26664o(5402);
                return a;
            }
        }
        decode = Uri.decode(substring).getBytes();
        C24456e a2 = mo40381a(new ByteArrayInputStream(decode), decode.length);
        MethodCollector.m26664o(5402);
        return a2;
    }
}
