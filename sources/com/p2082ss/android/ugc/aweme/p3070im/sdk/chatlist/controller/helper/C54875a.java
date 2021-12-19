package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.helper;

import android.text.TextUtils;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.keva.Keva;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1408d.C19536ag;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19587an;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.data.model.C54006a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3103a.AbstractC54002g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3103a.C53982a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3103a.C53998c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3103a.EnumC53997b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3103a.EnumC54001f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.like.p3117ui.DmViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3146b.C54839a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.notification.p3211a.C55648b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.notification.p3211a.C55654e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.notification.p3211a.C55671l;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.notification.p3211a.C55674n;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89070n;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.a */
public final class C54875a implements AbstractC54882d {

    /* renamed from: a */
    public static final C54876a f125648a = new C54876a((byte) 0);

    /* renamed from: b */
    private final Keva f125649b = Keva.getRepo("message_repo_key" + C55197c.m100919b());

    static {
        Covode.recordClassIndex(64595);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.helper.AbstractC54882d
    /* renamed from: a */
    public final boolean mo91895a(boolean z) {
        return z;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.a$a */
    public static final class C54876a {
        static {
            Covode.recordClassIndex(64596);
        }

        private C54876a() {
        }

        public /* synthetic */ C54876a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.helper.AbstractC54882d
    /* renamed from: a */
    public final void mo91892a() {
        this.f125649b.storeBoolean("guide_text", false);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.helper.AbstractC54882d
    /* renamed from: b */
    public final boolean mo91896b() {
        return this.f125649b.getBoolean("guide_text", true);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.helper.AbstractC54882d
    /* renamed from: a */
    public final void mo91894a(C19587an anVar) {
        C89219l.m154721d(anVar, "");
        C89219l.m154721d(anVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.a$c */
    public static final class C54878c implements AbstractC19479b<C19638h> {

        /* renamed from: a */
        final /* synthetic */ C54875a f125652a;

        /* renamed from: b */
        final /* synthetic */ C55648b f125653b;

        /* renamed from: c */
        final /* synthetic */ C19538ai f125654c;

        static {
            Covode.recordClassIndex(64598);
        }

        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final void mo27860a(C19672u uVar) {
            Integer num;
            StringBuilder sb = new StringBuilder("saveLastProperty get Conversation onFailure: error={");
            String str = null;
            if (uVar != null) {
                num = Integer.valueOf(uVar.f46728a);
            } else {
                num = null;
            }
            StringBuilder append = sb.append(num).append(", ");
            if (uVar != null) {
                str = uVar.f46730c;
            }
            C56244a.m102190b("DmHelper", append.append(str).append('}').toString());
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final /* synthetic */ void mo27861a(C19638h hVar) {
            Long l;
            String str;
            String str2;
            C1213t<String> a;
            String str3;
            C19638h hVar2 = hVar;
            if (hVar2 != null) {
                List a2 = C89070n.m154553a((Iterable) this.f125653b.f126925a, (Comparator) new C54879a());
                if ((!a2.isEmpty()) && a2 != null) {
                    C19538ai aiVar = this.f125654c;
                    Map<String, String> localExt = hVar2.getLocalExt();
                    if (localExt == null) {
                        localExt = new LinkedHashMap<>();
                    }
                    C55674n nVar = (C55674n) C89070n.m154586h(a2);
                    C54839a c = C54881c.m100498c(hVar2);
                    int i = C54880b.f125655a[nVar.f126995b.ordinal()];
                    if (i == 1) {
                        C19536ag agVar = nVar.f126994a.f126992a;
                        Long l2 = agVar.create_time;
                        if (c != null) {
                            l = c.getCreate_at();
                        } else {
                            l = null;
                        }
                        if (!(!C89219l.m154714a(l2, l))) {
                            String valueOf = String.valueOf(agVar.uid.longValue());
                            if (c != null) {
                                str2 = c.getSender_uid();
                            } else {
                                str2 = null;
                            }
                            if (!(true ^ C89219l.m154714a((Object) valueOf, (Object) str2))) {
                                return;
                            }
                        }
                        C27910f fVar = C54881c.f125656a;
                        String str4 = agVar.key;
                        String str5 = agVar.idempotent_id;
                        Long l3 = agVar.create_time;
                        String str6 = agVar.value;
                        Long l4 = agVar.uid;
                        if (l4 != null) {
                            str = String.valueOf(l4.longValue());
                        } else {
                            str = null;
                        }
                        String b = fVar.mo46674b(new C54839a(str4, str5, l3, str6, str, agVar.sec_uid, agVar.msgUuid, aiVar, 0));
                        C56244a.m102190b("DmHelper", "saveLastProperty called ,add " + aiVar.getUuid());
                        localExt.put("a:s_latest_message_property", b);
                    } else if (i == 2) {
                        if (c != null) {
                            str3 = c.getIdempotent_id();
                        } else {
                            str3 = null;
                        }
                        if (TextUtils.equals(str3, nVar.f126994a.f126992a.idempotent_id)) {
                            C56244a.m102190b("DmHelper", "saveLastProperty called ,remove " + aiVar.getUuid());
                            localExt.remove("a:s_latest_message_property");
                        } else {
                            C56244a.m102190b("DmHelper", "saveLastProperty called ,not remove " + aiVar.getUuid());
                        }
                    }
                    hVar2.setLocalExt(localExt);
                    String conversationId = hVar2.getConversationId();
                    C89219l.m154716b(conversationId, "");
                    AbstractC17427b.C17428a.m32308a(conversationId).mo27747b(localExt, (AbstractC19479b<C19638h>) null);
                    DmViewModel a3 = DmViewModel.C54241a.m99497a(C17873f.m33102j());
                    if (a3 != null && (a = a3.mo91332a()) != null) {
                        a.setValue(conversationId);
                    }
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.a$c$a */
        public static final class C54879a<T> implements Comparator {
            static {
                Covode.recordClassIndex(64599);
            }

            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return C89090a.m154604a(t.f126994a.f126992a.create_time, t2.f126994a.f126992a.create_time);
            }
        }

        C54878c(C54875a aVar, C55648b bVar, C19538ai aiVar) {
            this.f125652a = aVar;
            this.f125653b = bVar;
            this.f125654c = aiVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.helper.AbstractC54882d
    /* renamed from: a */
    public final String mo91891a(C19638h hVar) {
        String str;
        if (!C54881c.m100494a(hVar)) {
            return null;
        }
        String str2 = "";
        if (hVar != null && hVar.isGroupChat()) {
            StringBuilder sb = new StringBuilder();
            C54839a c = C54881c.m100498c(hVar);
            if (!(c == null || c.getIdempotent_id() == null)) {
                EnumC53997b bVar = EnumC53997b.AT_MOST_DB;
                String conversationId = hVar.getConversationId();
                String idempotent_id = c.getIdempotent_id();
                if (idempotent_id == null) {
                    idempotent_id = str2;
                }
                C54006a a = C53982a.m99198a(bVar, new C53998c(conversationId, idempotent_id, c.getSender_sec_uid()), new C54877b(hVar, null));
                if (a == null || (str = a.getDisplayName()) == null) {
                    str = str2;
                }
                str2 = str;
            }
            str2 = sb.append(str2).append(' ').toString();
        }
        return str2 + C17867d.m33078a().getResources().getString(R.string.cut);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.a$b */
    public static final class C54877b implements AbstractC54002g {

        /* renamed from: a */
        final /* synthetic */ C19638h f125650a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f125651b = null;

        static {
            Covode.recordClassIndex(64597);
        }

        C54877b(C19638h hVar, AbstractC89172b bVar) {
            this.f125650a = hVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3103a.AbstractC54002g
        /* renamed from: a */
        public final void mo91093a(C54006a aVar, EnumC54001f fVar) {
            String str = "";
            C89219l.m154721d(aVar, str);
            C89219l.m154721d(fVar, str);
            AbstractC89172b bVar = this.f125651b;
            if (bVar != null) {
                String conversationId = this.f125650a.getConversationId();
                if (conversationId != null) {
                    str = conversationId;
                }
                bVar.invoke(str);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.helper.AbstractC54882d
    /* renamed from: a */
    public final void mo91893a(C19538ai aiVar, Map<String, ? extends List<? extends C19536ag>> map, Map<String, ? extends List<? extends C19536ag>> map2) {
        C55648b a;
        List<C55674n> list;
        if (aiVar != null && TextUtils.equals(C55197c.m100919b().toString(), String.valueOf(aiVar.getSender())) && (a = C55671l.C55672a.m101429a(map2, map)) != null && (list = a.f126925a) != null && !list.isEmpty()) {
            AbstractC17420a.C17421a.m32276a().mo27725a(aiVar.getConversationId(), new C55654e.C55658d(C55654e.f126932b, a, aiVar));
            AbstractC17420a.C17421a.m32276a().mo27725a(aiVar.getConversationId(), new C54878c(this, a, aiVar));
        }
    }
}
