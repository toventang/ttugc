package com.p2082ss.android.ugc.aweme.feed.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28031v;
import com.google.gson.C28024q;
import com.google.gson.p2020c.C27897a;
import com.google.gson.p2020c.C27900c;

/* renamed from: com.ss.android.ugc.aweme.feed.model.live.RawStringJsonAdapter */
public class RawStringJsonAdapter extends AbstractC28031v<String> {
    static {
        Covode.recordClassIndex(58809);
    }

    @Override // com.google.gson.AbstractC28031v
    public String read(C27897a aVar) {
        return C28024q.m56137a(aVar).toString();
    }

    public void write(C27900c cVar, String str) {
        if (str == null) {
            cVar.mo46654f();
            return;
        }
        cVar.mo46656g();
        cVar.mo46657h();
        cVar.f65524a.append((CharSequence) str);
    }
}
