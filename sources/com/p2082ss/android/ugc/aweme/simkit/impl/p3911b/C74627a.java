package com.p2082ss.android.ugc.aweme.simkit.impl.p3911b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.simkit.AbstractC74616d;
import com.p2082ss.android.ugc.aweme.simkit.api.AbstractC74606e;
import com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i;
import com.p2082ss.android.ugc.aweme.video.preload.C80937s;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84232a;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84235d;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84241i;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84278n;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.C84264a;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.C84273i;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.C84274j;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.C84276l;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.simkit.impl.b.a */
public final class C74627a implements AbstractC84278n {

    /* renamed from: a */
    AbstractC80918i f167778a;

    /* renamed from: c */
    private AbstractC74606e f167779c;

    static {
        Covode.recordClassIndex(87448);
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84278n
    /* renamed from: a */
    public final C84274j mo117450a(AbstractC84278n.AbstractC84280a aVar) {
        Object obj;
        AbstractC80918i b;
        C84273i a = aVar.mo129301a();
        C84241i iVar = a.f188459a;
        AbstractC74606e eVar = this.f167779c;
        if (eVar == null || (obj = eVar.mo117331a(iVar)) == null || TextUtils.isEmpty(obj.toString())) {
            obj = this.f167778a.mo124063a(iVar, iVar.getBitRatedRatioUri(), a.f188461c);
        }
        if (AbstractC74616d.m131036a().mo117290b().getAppConfig().isDebug() && (b = C80937s.m140453b()) != null) {
            b.mo124079d(iVar);
        }
        return new C84274j(obj);
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84278n
    /* renamed from: c */
    public final C84274j mo117452c(AbstractC84278n.AbstractC84280a aVar) {
        Object obj;
        AbstractC80918i b;
        C84276l c = aVar.mo129306c();
        C84232a aVar2 = c.f188464a;
        C84241i iVar = null;
        if (aVar2 != null) {
            iVar = new C84241i();
            iVar.setSourceId(String.valueOf(aVar2.getSubId()));
            if (aVar2.getUrl() != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(aVar2.getUrl());
                iVar.setUrlList(arrayList);
            }
            if (aVar2.getUri() != null) {
                iVar.setUri(aVar2.getUri());
            }
        }
        AbstractC74606e eVar = this.f167779c;
        if (eVar == null || (obj = eVar.mo117331a(iVar)) == null || TextUtils.isEmpty(obj.toString())) {
            obj = this.f167778a.mo124063a(iVar, iVar.getSourceId(), c.f188466c);
        }
        if (AbstractC74616d.m131036a().mo117290b().getAppConfig().isDebug() && (b = C80937s.m140453b()) != null) {
            b.mo124079d(iVar);
        }
        return new C84274j(obj);
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84278n
    /* renamed from: b */
    public final C84274j mo117451b(AbstractC84278n.AbstractC84280a aVar) {
        Object obj;
        AbstractC80918i b;
        C84264a b2 = aVar.mo129305b();
        C84235d dVar = b2.f188450a;
        C84241i iVar = null;
        if (dVar != null) {
            iVar = new C84241i();
            if (dVar.getUrlKey() != null) {
                iVar.setSourceId(dVar.getUrlKey());
            }
            if (dVar.getFileHash() != null) {
                iVar.setFileHash(dVar.getFileHash());
            }
            iVar.setHeight(dVar.getHeight());
            iVar.setWidth(dVar.getWidth());
            iVar.setSize(dVar.getSize());
            if (dVar.getUri() != null) {
                iVar.setUri(dVar.getUri());
            }
            if (dVar.getUrlKey() != null) {
                iVar.setUrlKey(dVar.getUrlKey());
            }
            if (dVar.getUrlList() != null) {
                iVar.setUrlList(dVar.getUrlList());
            }
            if (dVar.getaK() != null) {
                iVar.setaK(dVar.getaK());
            }
        }
        AbstractC74606e eVar = this.f167779c;
        if (eVar == null || (obj = eVar.mo117331a(iVar)) == null || TextUtils.isEmpty(obj.toString())) {
            obj = this.f167778a.mo124063a(iVar, iVar.getSourceId(), b2.f188452c);
        }
        if (AbstractC74616d.m131036a().mo117290b().getAppConfig().isDebug() && (b = C80937s.m140453b()) != null) {
            b.mo124079d(iVar);
        }
        return new C84274j(obj);
    }

    public C74627a(AbstractC80918i iVar, AbstractC74606e eVar) {
        this.f167778a = iVar;
        this.f167779c = eVar;
    }
}
