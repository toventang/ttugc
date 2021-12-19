package com.p2082ss.android.ugc.playerkit.videoview;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63041i;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84266c;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84269e;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84275k;

/* renamed from: com.ss.android.ugc.playerkit.videoview.d */
public enum EnumC84263d {
    INSTANCE;
    

    /* renamed from: a */
    private AbstractC63041i f188445a;

    /* renamed from: b */
    private AbstractC84261c f188446b;

    /* renamed from: c */
    private AbstractC84266c f188447c;

    /* renamed from: d */
    private AbstractC84269e f188448d;

    /* renamed from: e */
    private AbstractC84275k f188449e;

    public final AbstractC84261c cacheChecker() {
        return this.f188446b;
    }

    public final AbstractC84266c getBitrateManager() {
        return this.f188447c;
    }

    public final AbstractC84269e getHttpsHelper() {
        return this.f188448d;
    }

    public final AbstractC84275k getPlayUrlBuilder() {
        return this.f188449e;
    }

    public final AbstractC63041i playInfoCallback() {
        return this.f188445a;
    }

    static {
        Covode.recordClassIndex(98178);
    }

    public final EnumC84263d setBitrateManager(AbstractC84266c cVar) {
        this.f188447c = cVar;
        return this;
    }

    public final EnumC84263d setCacheChecker(AbstractC84261c cVar) {
        this.f188446b = cVar;
        return this;
    }

    public final EnumC84263d setHttpsHelper(AbstractC84269e eVar) {
        this.f188448d = eVar;
        return this;
    }

    public final EnumC84263d setPlayInfoCallback(AbstractC63041i iVar) {
        this.f188445a = iVar;
        return this;
    }

    public final EnumC84263d setPlayUrlBuilder(AbstractC84275k kVar) {
        this.f188449e = kVar;
        return this;
    }
}
