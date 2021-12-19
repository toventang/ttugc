package com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3198a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19478a;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19480c;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19639i;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.bytedance.p1399im.core.proto.SortType;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3139a.C54603a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55214j;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3198a.p3199a.C55340b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3200b.p3202b.C55370a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a.e */
public final class C55357e {

    /* renamed from: a */
    public static final AbstractC89244h f126576a = C89250i.m154773a((AbstractC89171a) C55359b.f126578a);

    /* renamed from: b */
    public static final C55358a f126577b = new C55358a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a.e$a */
    public static final class C55358a {
        static {
            Covode.recordClassIndex(65123);
        }

        /* renamed from: a */
        public static C55357e m101168a() {
            return (C55357e) C55357e.f126576a.getValue();
        }

        private C55358a() {
        }

        public /* synthetic */ C55358a(byte b) {
            this();
        }
    }

    private C55357e() {
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a.e$b */
    static final class C55359b extends AbstractC89220m implements AbstractC89171a<C55357e> {

        /* renamed from: a */
        public static final C55359b f126578a = new C55359b();

        static {
            Covode.recordClassIndex(65124);
        }

        C55359b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C55357e invoke() {
            return new C55357e((byte) 0);
        }
    }

    static {
        Covode.recordClassIndex(65122);
    }

    public /* synthetic */ C55357e(byte b) {
        this();
    }

    /* renamed from: a */
    public static String m101163a(C19638h hVar) {
        C19639i coreInfo;
        if (hVar == null || (coreInfo = hVar.getCoreInfo()) == null) {
            return null;
        }
        return coreInfo.getIcon();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a.e$c */
    public static final class C55360c implements AbstractC19480c<C19638h> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f126579a;

        /* renamed from: b */
        final /* synthetic */ List f126580b;

        static {
            Covode.recordClassIndex(65125);
        }

        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final /* synthetic */ void mo27861a(Object obj) {
            String str;
            C19638h hVar = (C19638h) obj;
            StringBuilder sb = new StringBuilder("onSuccess, ");
            if (hVar != null) {
                str = hVar.toString();
            } else {
                str = null;
            }
            C56244a.m102191c("Creating group chat", sb.append(str).toString());
            AbstractC89172b bVar = this.f126579a;
            if (bVar != null) {
                bVar.invoke(hVar);
            }
            C54603a.m100102a(0, hVar, "group", this.f126580b);
        }

        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final void mo27860a(C19672u uVar) {
            String str;
            int i;
            String str2;
            C55370a aVar;
            Integer statusCode;
            StringBuilder sb = new StringBuilder("onFailure, ");
            if (uVar != null) {
                str = uVar.toString();
            } else {
                str = null;
            }
            C56244a.m102191c("Creating group chat", sb.append(str).toString());
            C55340b.m101158a(C17867d.m33078a(), uVar);
            AbstractC89172b bVar = this.f126579a;
            if (bVar != null) {
                bVar.invoke(null);
            }
            if (uVar == null || (str2 = uVar.f46732e) == null || (aVar = (C55370a) C55214j.m100957a(str2, C55370a.class)) == null || (statusCode = aVar.getStatusCode()) == null) {
                i = -1;
            } else {
                i = statusCode.intValue();
            }
            C54603a.m100102a(i, null, "group", this.f126580b);
        }

        C55360c(AbstractC89172b bVar, List list) {
            this.f126579a = bVar;
            this.f126580b = list;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.im.core.d.u] */
        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19480c
        /* renamed from: a */
        public final /* synthetic */ void mo31136a(C19638h hVar, C19672u uVar) {
            String str;
            String str2;
            C55370a aVar;
            int i;
            Integer statusCode;
            String str3;
            Integer statusCode2;
            C19638h hVar2 = hVar;
            StringBuilder sb = new StringBuilder("onSuccessWithInfo, ");
            if (hVar2 != null) {
                str = hVar2.toString();
            } else {
                str = null;
            }
            StringBuilder append = sb.append(str).append('\n');
            if (uVar != null) {
                str2 = uVar.toString();
            } else {
                str2 = null;
            }
            C56244a.m102191c("Creating group chat", append.append(str2).toString());
            if (uVar == null || (str3 = uVar.f46732e) == null) {
                aVar = null;
            } else {
                aVar = (C55370a) C55214j.m100957a(str3, C55370a.class);
                if (aVar != null) {
                    String statusMsg = aVar.getStatusMsg();
                    if (statusMsg != null && statusMsg.length() > 0) {
                        new C79459a(C17867d.m33078a()).mo123052a(statusMsg).mo123053a();
                    }
                    if (!(aVar == null || (statusCode2 = aVar.getStatusCode()) == null || statusCode2.intValue() != 0)) {
                        AbstractC89172b bVar = this.f126579a;
                        if (bVar != null) {
                            bVar.invoke(hVar2);
                        }
                        if (aVar != null || (statusCode = aVar.getStatusCode()) == null) {
                            i = -1;
                        } else {
                            i = statusCode.intValue();
                        }
                        C54603a.m100102a(i, hVar2, "group", this.f126580b);
                    }
                }
            }
            AbstractC89172b bVar2 = this.f126579a;
            if (bVar2 != null) {
                bVar2.invoke(null);
            }
            if (aVar != null) {
            }
            i = -1;
            C54603a.m100102a(i, hVar2, "group", this.f126580b);
        }
    }

    /* renamed from: a */
    public static List<IMUser> m101164a(List<? extends IMUser> list) {
        List arrayList;
        if (list != null) {
            arrayList = C89070n.m154585g((Collection) list);
        } else {
            arrayList = new ArrayList();
        }
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin != null) {
            String currentUserID = createIUserServicebyMonsterPlugin.getCurrentUserID();
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (C89219l.m154714a((Object) next.getUid(), (Object) currentUserID)) {
                        if (next != null) {
                            arrayList.remove(next);
                            arrayList.add(0, next);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static UrlModel m101167b(C19638h hVar) {
        String a;
        if (hVar == null || (a = m101163a(hVar)) == null || a.length() == 0) {
            return null;
        }
        UrlModel urlModel = new UrlModel();
        urlModel.setUrlList(C89070n.m154524c(a));
        return urlModel;
    }

    /* renamed from: a */
    public static void m101165a(long j, AbstractC19478a<List<C19638h>> aVar) {
        C89219l.m154721d(aVar, "");
        AbstractC17420a.C17421a.m32276a().mo27722a(j, SortType.GROUP_NAME, (Boolean) false, aVar);
    }

    /* renamed from: a */
    public static void m101166a(List<String> list, AbstractC89172b<? super C19638h, C89391z> bVar) {
        C89219l.m154721d(list, "");
        AbstractC17420a a = AbstractC17420a.C17421a.m32276a();
        HashMap hashMap = new HashMap();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("source_app_id", C17867d.f42590n);
        jSONObject.put("source_type", 6);
        String jSONObject2 = jSONObject.toString();
        C89219l.m154716b(jSONObject2, "");
        hashMap.put("create", jSONObject2);
        hashMap.put("group_create_type", "0");
        a.mo27727a(list, hashMap, new C55360c(bVar, list));
    }
}
