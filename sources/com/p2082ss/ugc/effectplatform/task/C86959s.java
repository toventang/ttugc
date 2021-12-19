package com.p2082ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.algorithm.C86712f;
import com.p2082ss.ugc.effectplatform.model.C86846i;
import com.p2082ss.ugc.effectplatform.model.TagInfo;
import com.p2082ss.ugc.effectplatform.model.algorithm.ModelInfo;
import com.p2082ss.ugc.effectplatform.model.net.DownloadableModelResponse;
import com.p2082ss.ugc.effectplatform.p4440a.p4442b.C86695b;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.AbstractC86697a;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.C86701e;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.C86702f;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.EnumC86699c;
import com.p2082ss.ugc.effectplatform.p4450g.C86791c;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86799h;
import com.p2082ss.ugc.effectplatform.util.C86992i;
import com.p2082ss.ugc.effectplatform.util.C87002p;
import com.p2082ss.ugc.effectplatform.util.C87007u;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p4519d.p4520a.p4522b.p4525c.C87998a;
import p4519d.p4520a.p4534g.C88067b;
import p4519d.p4520a.p4534g.C88069d;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.task.s */
public final class C86959s extends AbstractC86891b {

    /* renamed from: a */
    final C87998a f196064a = new C87998a(false);

    /* renamed from: b */
    private final C86687a f196065b;

    /* renamed from: c */
    private final C86712f f196066c;

    /* renamed from: d */
    private final int f196067d;

    /* renamed from: f */
    private final AbstractC86960a f196068f;

    /* renamed from: com.ss.ugc.effectplatform.task.s$a */
    public interface AbstractC86960a {
        static {
            Covode.recordClassIndex(102725);
        }

        /* renamed from: a */
        void mo140591a(C86846i iVar);

        /* renamed from: a */
        void mo140592a(Exception exc);
    }

    static {
        Covode.recordClassIndex(102724);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86891b
    /* renamed from: b */
    public final void mo139953b() {
    }

    /* renamed from: c */
    private final C86701e m150602c() {
        Object obj;
        Object obj2;
        TagInfo tagInfo;
        HashMap hashMap = new HashMap();
        String str = this.f196065b.f195447c;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        hashMap.put("sdk_version", str);
        String str3 = this.f196065b.f195452h;
        if (str3 != null) {
            str2 = str3;
        }
        hashMap.put("device_type", str2);
        C86687a.EnumC86690c cVar = this.f196065b.f195438F;
        if (cVar == null) {
            cVar = C86687a.EnumC86690c.ONLINE;
        }
        hashMap.put("status", String.valueOf(cVar.ordinal()));
        int i = this.f196067d;
        if (i > 0) {
            hashMap.put("busi_id", String.valueOf(i));
        }
        try {
            obj = C89379q.m157068constructorimpl(this.f196066c.mo139955b("model/effect_local_config.json"));
        } catch (Throwable th) {
            obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        TagInfo tagInfo2 = null;
        if (C89379q.m157073isFailureimpl(obj)) {
            obj = null;
        }
        String str4 = (String) obj;
        if (str4 != null) {
            try {
                C86695b bVar = this.f196065b.f195461q;
                if (bVar != null) {
                    tagInfo = (TagInfo) bVar.f195508a.convertJsonToObj(str4, TagInfo.class);
                } else {
                    tagInfo = null;
                }
                obj2 = C89379q.m157068constructorimpl(tagInfo);
            } catch (Throwable th2) {
                obj2 = C89379q.m157068constructorimpl(C89382r.m154941a(th2));
            }
            if (!C89379q.m157073isFailureimpl(obj2)) {
                tagInfo2 = obj2;
            }
            TagInfo tagInfo3 = tagInfo2;
            if (tagInfo3 != null) {
                hashMap.put("tag", tagInfo3.getTag());
            }
        }
        hashMap.putAll(C86992i.m150657a(this.f196065b, false));
        return new C86701e(C87002p.m150693a(hashMap, C89219l.m154704a(this.f196065b.f195433A, (Object) "/model/api/arithmetics")), EnumC86699c.GET, null, null, false, 60);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86891b
    /* renamed from: a */
    public final void mo139952a() {
        C86702f fVar;
        AbstractC86697a aVar;
        String a;
        DownloadableModelResponse downloadableModelResponse;
        Map<String, List<ModelInfo>> arithmetics;
        C88069d a2 = C88069d.C88070a.m153145a();
        try {
            if (!this.f195913e) {
                C86701e c = m150602c();
                V v = this.f196065b.f195462r.f199870a;
                String str = null;
                if (v != null) {
                    fVar = v.fetchFromNetwork(c);
                    if (!(fVar == null || (aVar = fVar.f195518b) == null || (a = C86791c.m150338a(aVar)) == null)) {
                        if (!C87007u.m150697a(a)) {
                            C86695b bVar = this.f196065b.f195461q;
                            if (bVar == null || (downloadableModelResponse = (DownloadableModelResponse) bVar.f195508a.convertJsonToObj(a, DownloadableModelResponse.class)) == null) {
                                AbstractC86960a aVar2 = this.f196068f;
                                if (aVar2 != null) {
                                    aVar2.mo140592a(new RuntimeException("result return null when parseResponse"));
                                    return;
                                }
                                return;
                            }
                            C88067b bVar2 = new C88067b();
                            int status_code = downloadableModelResponse.getStatus_code();
                            if (status_code == 0) {
                                DownloadableModelResponse.Data data = downloadableModelResponse.getData();
                                if (data == null || (arithmetics = data.getArithmetics()) == null) {
                                    throw new IllegalStateException("status_code == 0 but data == null, indicates there may be an internal server error");
                                }
                                for (Map.Entry<String, List<ModelInfo>> entry : arithmetics.entrySet()) {
                                    String key = entry.getKey();
                                    entry.getValue();
                                    List<ModelInfo> list = arithmetics.get(key);
                                    if (list != null) {
                                        for (ModelInfo modelInfo : list) {
                                            bVar2.mo142622a(key, modelInfo);
                                        }
                                    } else {
                                        throw new IllegalStateException("modelInfo list is null".toString());
                                    }
                                }
                                C86846i iVar = new C86846i(bVar2);
                                AbstractC86960a aVar3 = this.f196068f;
                                if (aVar3 != null) {
                                    aVar3.mo140591a(iVar);
                                }
                                AbstractC86799h hVar = this.f196065b.f195439G;
                                if (hVar != null) {
                                    hVar.onFetchModelList(true, null, a2.mo142623a(), this.f196065b.f195447c);
                                    return;
                                }
                                return;
                            }
                            throw new IllegalStateException("status code == " + status_code + " , indicates there is no model config from server, sdk version is " + this.f196065b.f195447c);
                        }
                        AbstractC86960a aVar4 = this.f196068f;
                        if (aVar4 != null) {
                            StringBuilder sb = new StringBuilder("responseString is empty when convertToString, errorMsg: ");
                            if (fVar != null) {
                                str = fVar.f195520d;
                            }
                            aVar4.mo140592a(new RuntimeException(sb.append(str).toString()));
                            return;
                        }
                        return;
                    }
                } else {
                    fVar = null;
                }
                AbstractC86960a aVar5 = this.f196068f;
                if (aVar5 != null) {
                    StringBuilder sb2 = new StringBuilder("responseString return null when convertToString, errorMsg: ");
                    if (fVar != null) {
                        str = fVar.f195520d;
                    }
                    aVar5.mo140592a(new RuntimeException(sb2.append(str).toString()));
                }
            }
        } catch (Exception e) {
            AbstractC86799h hVar2 = this.f196065b.f195439G;
            if (hVar2 != null) {
                hVar2.onFetchModelList(false, e.getMessage(), a2.mo142623a(), this.f196065b.f195447c);
            }
            AbstractC86960a aVar6 = this.f196068f;
            if (aVar6 != null) {
                aVar6.mo140592a(e);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86959s(C86687a aVar, C86712f fVar, int i, AbstractC86960a aVar2) {
        super(null);
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(fVar, "");
        this.f196065b = aVar;
        this.f196066c = fVar;
        this.f196067d = i;
        this.f196068f = aVar2;
    }
}
