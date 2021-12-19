package com.p2082ss.android.ugc.aweme.p3070im.sdk.notification.p3211a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p1399im.core.p1404a.C19489e;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19639i;
import com.bytedance.p1399im.core.proto.ReferenceInfo;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ReferenceInfoHint;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.data.model.C54006a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3103a.AbstractC54002g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3103a.C53982a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3103a.C53998c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3103a.EnumC53997b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.helper.C54881c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.p3150b.C54871c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55082e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55085g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3184b.C55193c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3198a.C55357e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.notification.C55675b;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56202c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;
import p4600h.C89376n;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.a.c */
public final class C55649c {

    /* renamed from: a */
    static final Queue<C55667i> f126927a = new LinkedBlockingDeque();

    /* renamed from: b */
    static final List<C19538ai> f126928b = Collections.synchronizedList(new ArrayList());

    /* renamed from: c */
    public static final C55649c f126929c = new C55649c();

    private C55649c() {
    }

    /* renamed from: a */
    public static void m101400a() {
        f126928b.clear();
    }

    /* renamed from: b */
    public static void m101404b() {
        f126927a.clear();
    }

    static {
        Covode.recordClassIndex(65432);
    }

    /* renamed from: c */
    public static boolean m101405c() {
        if (!f126927a.isEmpty() || !f126928b.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static C55670k m101406d() {
        C55667i poll;
        C19638h a;
        String name;
        C19638h a2;
        C54006a a3;
        String displayName;
        String refmsg_uid;
        String string;
        IMContact a4;
        List<C19538ai> list = f126928b;
        String str = "";
        C89219l.m154716b(list, str);
        String str2 = null;
        UrlModel urlModel = null;
        if (!(!list.isEmpty())) {
            Queue<C55667i> queue = f126927a;
            if ((!queue.isEmpty()) && !queue.isEmpty() && (poll = queue.poll()) != null) {
                int i = C55653d.f126931a[poll.f126964a.ordinal()];
                if (i == 1) {
                    C55675b bVar = poll.f126968e;
                    if (!(bVar == null || (a = AbstractC17420a.C17421a.m32276a().mo27720a(bVar.f126996a)) == null)) {
                        Integer valueOf = Integer.valueOf(a.getConversationType());
                        String str3 = bVar.f126996a;
                        C55357e.C55358a.m101168a();
                        UrlModel b = C55357e.m101167b(a);
                        C19639i coreInfo = a.getCoreInfo();
                        if (!(coreInfo == null || (name = coreInfo.getName()) == null)) {
                            str = name;
                        }
                        return new C55670k(0, valueOf, str3, null, b, null, null, str, bVar.f126997b, false, null, null, null, 2063080);
                    }
                } else if (i == 2) {
                    return C54881c.m100487a(poll);
                } else {
                    if (i == 3) {
                        C19538ai aiVar = poll.f126965b;
                        if (aiVar != null) {
                            int conversationType = aiVar.getConversationType();
                            if (conversationType == C19489e.AbstractC19490a.f46180a) {
                                IMUser b2 = C55085g.m100757b(String.valueOf(aiVar.getSender()), aiVar.getSecSender());
                                if (b2 != null) {
                                    return new C55670k(0, Integer.valueOf(C19489e.AbstractC19490a.f46180a), aiVar.getConversationId(), Integer.valueOf(aiVar.getMsgType()), b2.getAvatarThumb(), null, null, b2.getDisplayName(), C54871c.m100473a(EnumC53772b.C53814f.m99071b(aiVar), aiVar, true), false, null, 1, String.valueOf(aiVar.getSender()), 490208);
                                }
                            } else if (conversationType == C19489e.AbstractC19490a.f46181b && !C56202c.m102111a() && (a2 = AbstractC17420a.C17421a.m32276a().mo27720a(aiVar.getConversationId())) != null) {
                                StringBuilder sb = new StringBuilder();
                                int msgType = aiVar.getMsgType();
                                if (!(msgType == 1 || msgType == 1030 || msgType == 1031 || (a3 = C53982a.m99198a(EnumC53997b.AT_MOST_DB, new C53998c(aiVar.getConversationId(), String.valueOf(aiVar.getSender()), aiVar.getSecSender()), (AbstractC54002g) null)) == null || (displayName = a3.getDisplayName()) == null)) {
                                    if (aiVar.getReferenceInfo() != null) {
                                        ReferenceInfo referenceInfo = aiVar.getReferenceInfo();
                                        C89219l.m154716b(referenceInfo, str);
                                        ReferenceInfoHint a5 = C55193c.m100906a(referenceInfo);
                                        if (!(a5 == null || (refmsg_uid = a5.getRefmsg_uid()) == null)) {
                                            User d = C55197c.m100922d();
                                            if (C89219l.m154714a((Object) refmsg_uid, (Object) (d != null ? d.getUid() : null))) {
                                                sb.append(C17867d.m33078a().getResources().getString(R.string.b9i, displayName, str));
                                            }
                                        }
                                    }
                                    sb.append(displayName).append(": ");
                                }
                                sb.append(C54871c.m100473a(EnumC53772b.C53814f.m99071b(aiVar), aiVar, true));
                                Integer valueOf2 = Integer.valueOf(aiVar.getMsgType());
                                Integer valueOf3 = Integer.valueOf(C19489e.AbstractC19490a.f46181b);
                                String conversationId = aiVar.getConversationId();
                                C55357e.C55358a.m101168a();
                                UrlModel b3 = C55357e.m101167b(a2);
                                C19639i coreInfo2 = a2.getCoreInfo();
                                if (coreInfo2 != null) {
                                    str2 = coreInfo2.getName();
                                }
                                return new C55670k(0, valueOf3, conversationId, valueOf2, b3, null, null, str2, sb.toString(), false, null, 1, String.valueOf(aiVar.getSender()), 490208);
                            }
                        }
                        return null;
                    }
                    throw new C89376n();
                }
            }
        } else if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list);
            list.clear();
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i2 = 0;
            for (Object obj : arrayList) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C89070n.m154520a();
                }
                C19538ai aiVar2 = (C19538ai) obj;
                C89219l.m154716b(aiVar2, str);
                if (aiVar2.getConversationType() == C19489e.AbstractC19490a.f46180a) {
                    IMUser b4 = C55085g.m100757b(String.valueOf(aiVar2.getSender()), aiVar2.getSecSender());
                    if (b4 != null && !linkedHashSet.contains(b4)) {
                        linkedHashSet.add(b4);
                    }
                } else if (aiVar2.getConversationType() == C19489e.AbstractC19490a.f46181b) {
                    AbstractC17420a a6 = AbstractC17420a.C17421a.m32276a();
                    Object obj2 = arrayList.get(i2);
                    C89219l.m154716b(obj2, str);
                    C19638h a7 = a6.mo27720a(((C19538ai) obj2).getConversationId());
                    if (!(a7 == null || (a4 = C55082e.m100739a(a7)) == null || linkedHashSet.contains(a4))) {
                        linkedHashSet.add(a4);
                    }
                }
                sb3.append(aiVar2.getSender());
                if (i2 != C89070n.m154517a((List) arrayList)) {
                    sb3.append(",");
                }
                i2 = i3;
            }
            if (!linkedHashSet.isEmpty()) {
                int i4 = 0;
                for (Object obj3 : linkedHashSet) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        C89070n.m154520a();
                    }
                    sb2.append(((IMContact) obj3).getDisplayName());
                    if (i4 != linkedHashSet.size() - 1) {
                        sb2.append(", ");
                    }
                    i4 = i5;
                }
                C19538ai aiVar3 = (C19538ai) C89070n.m154586h((List) arrayList);
                int size = arrayList.size();
                String sb4 = sb2.toString();
                if (linkedHashSet.size() == 1 && size == 1) {
                    C89219l.m154716b(aiVar3, str);
                    string = C54871c.m100473a(EnumC53772b.C53814f.m99071b(aiVar3), aiVar3, true);
                } else {
                    string = C17867d.m33078a().getResources().getString(R.string.cj7, Integer.valueOf(size));
                    C89219l.m154716b(string, str);
                }
                UrlModel displayAvatar = linkedHashSet.size() == 1 ? ((IMContact) C89070n.m154560b(linkedHashSet, 0)).getDisplayAvatar() : null;
                UrlModel displayAvatar2 = linkedHashSet.size() > 1 ? ((IMContact) C89070n.m154560b(linkedHashSet, 0)).getDisplayAvatar() : null;
                if (linkedHashSet.size() > 1) {
                    urlModel = ((IMContact) C89070n.m154560b(linkedHashSet, 1)).getDisplayAvatar();
                }
                C89219l.m154716b(aiVar3, str);
                Integer valueOf4 = Integer.valueOf(aiVar3.getConversationType());
                Integer valueOf5 = Integer.valueOf(size);
                String sb5 = sb3.toString();
                C89219l.m154716b(sb5, str);
                return new C55670k(1, valueOf4, null, null, displayAvatar, displayAvatar2, urlModel, sb4, string, true, linkedHashSet, valueOf5, sb5, 227884);
            }
        }
        return null;
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.a.c$a */
    public static final class EnumC55650a extends Enum<EnumC55650a> {
        public static final EnumC55650a ASSEMBLE;
        public static final EnumC55650a NORMAL;

        /* renamed from: a */
        private static final /* synthetic */ EnumC55650a[] f126930a;

        static {
            Covode.recordClassIndex(65433);
            C55652b bVar = new C55652b("NORMAL");
            NORMAL = bVar;
            C55651a aVar = new C55651a("ASSEMBLE");
            ASSEMBLE = aVar;
            f126930a = new EnumC55650a[]{bVar, aVar};
        }

        public static EnumC55650a valueOf(String str) {
            return (EnumC55650a) Enum.valueOf(EnumC55650a.class, str);
        }

        public static EnumC55650a[] values() {
            return (EnumC55650a[]) f126930a.clone();
        }

        public abstract void enqueue(List<C19538ai> list);

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.a.c$a$a */
        static final class C55651a extends EnumC55650a {
            static {
                Covode.recordClassIndex(65434);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C55651a(String str) {
                super(str, 1, null);
            }

            @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.notification.p3211a.C55649c.EnumC55650a
            public final void enqueue(List<C19538ai> list) {
                C89219l.m154721d(list, "");
                C55649c.f126928b.addAll(list);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.a.c$a$b */
        static final class C55652b extends EnumC55650a {
            static {
                Covode.recordClassIndex(65435);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C55652b(String str) {
                super(str, 0, null);
            }

            @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.notification.p3211a.C55649c.EnumC55650a
            public final void enqueue(List<C19538ai> list) {
                C89219l.m154721d(list, "");
                for (T t : list) {
                    Queue<C55667i> queue = C55649c.f126927a;
                    C89219l.m154721d(t, "");
                    queue.offer(new C55667i(EnumC55669j.Message, t, null, null, null, 28));
                }
            }
        }

        private EnumC55650a(String str, int i) {
        }

        public /* synthetic */ EnumC55650a(String str, int i, C89214g gVar) {
            this(str, i);
        }
    }

    /* renamed from: a */
    public static void m101402a(C55667i iVar) {
        C89219l.m154721d(iVar, "");
        f126927a.offer(iVar);
    }

    /* renamed from: a */
    public static final boolean m101403a(C19538ai aiVar) {
        C89219l.m154721d(aiVar, "");
        C19638h a = AbstractC17420a.C17421a.m32276a().mo27720a(aiVar.getConversationId());
        if (a == null || !a.isMute()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m101401a(EnumC55650a aVar, List<C19538ai> list) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(list, "");
        aVar.enqueue(list);
    }
}
