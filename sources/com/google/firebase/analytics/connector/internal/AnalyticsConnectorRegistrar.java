package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.firebase.C27695b;
import com.google.firebase.analytics.connector.AbstractC27689a;
import com.google.firebase.components.AbstractC27719h;
import com.google.firebase.components.C27710b;
import com.google.firebase.components.C27727n;
import com.google.firebase.p2010b.AbstractC27702d;
import com.google.firebase.p2014f.C27748g;
import java.util.Arrays;
import java.util.List;

public class AnalyticsConnectorRegistrar implements AbstractC27719h {
    static {
        Covode.recordClassIndex(33274);
    }

    @Override // com.google.firebase.components.AbstractC27719h
    public List<C27710b<?>> getComponents() {
        return Arrays.asList(C27710b.m55404a(AbstractC27689a.class).mo46356a(C27727n.m55442a(C27695b.class)).mo46356a(C27727n.m55442a(Context.class)).mo46356a(C27727n.m55442a(AbstractC27702d.class)).mo46355a(C27694b.f65099a).mo46354a(2).mo46357a(), C27748g.m55473a("fire-analytics", "17.4.4"));
    }
}
