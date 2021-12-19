package com.bytedance.ies.p1208im.core.p1224e;

import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.p1208im.core.api.C17415a;
import com.bytedance.ies.p1208im.core.api.p1210a.AbstractC17417b;
import com.bytedance.ies.p1208im.core.api.p1210a.C17418c;
import com.bytedance.ies.p1208im.core.api.p1210a.EnumC17416a;
import com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17449b;
import com.bytedance.ies.p1208im.core.api.p1220j.AbstractC17469a;
import com.bytedance.ies.p1208im.core.api.p1220j.C17470b;
import com.bytedance.ies.p1208im.core.p1221b.AbstractC17485b;
import com.bytedance.ies.p1208im.core.p1223d.C17505a;
import com.bytedance.ies.p1208im.core.p1223d.C17506b;
import com.bytedance.ies.p1208im.core.p1223d.C17507c;
import com.bytedance.ies.p1208im.core.p1223d.C17508d;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19608bd;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.im.core.e.t */
public final class C17551t implements AbstractC17417b, AbstractC17469a, AbstractC17485b {

    /* renamed from: a */
    public static final C17551t f41995a = new C17551t();

    /* renamed from: b */
    private static final AbstractC89244h f41996b = C89250i.m154773a((AbstractC89171a) C17552a.f41997a);

    /* renamed from: a */
    private static LinkedList<String> m32513a() {
        return (LinkedList) f41996b.getValue();
    }

    private C17551t() {
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1220j.AbstractC17469a
    /* renamed from: a */
    public final void mo27899a(String str) {
        m32516b("connect event: ".concat(String.valueOf(str)));
    }

    @Override // com.bytedance.ies.p1208im.core.p1221b.AbstractC17485b
    /* renamed from: a */
    public final void mo27912a(String str, String str2) {
        m32516b("token changed: " + str + ", " + str2);
    }

    /* renamed from: com.bytedance.ies.im.core.e.t$a */
    static final class C17552a extends AbstractC89220m implements AbstractC89171a<LinkedList<String>> {

        /* renamed from: a */
        public static final C17552a f41997a = new C17552a();

        static {
            Covode.recordClassIndex(IHostUser.MESSAGE_NICKNAME_DUPLICATE_2);
        }

        C17552a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LinkedList<String> invoke() {
            return new LinkedList();
        }
    }

    static {
        Covode.recordClassIndex(20040);
    }

    /* renamed from: c */
    private static C17506b m32518c(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            return (C17506b) C80342dg.m139301a(str, C17506b.class);
        } catch (Throwable th) {
            C17415a.m32255b().mo27834a(th);
            return null;
        }
    }

    /* renamed from: a */
    private static int m32511a(C19538ai aiVar) {
        String str;
        C17505a content;
        C17506b c = m32518c(aiVar.getLocalExtValue("s:send_response_check_msg"));
        if (c == null) {
            return 0;
        }
        int checkCode = c.getCheckCode();
        if (checkCode == 7178 || checkCode == 7181 || checkCode == 7284 || checkCode == 7523 || checkCode == 7530 || checkCode == 7274 || checkCode == 7275) {
            int msgType = aiVar.getMsgType();
            int checkCode2 = c.getCheckCode();
            C17507c checkMsg = c.getCheckMsg();
            if (checkMsg == null || (content = checkMsg.getContent()) == null || (str = content.getTips()) == null || str.length() <= 0) {
                str = "self visible";
            }
            String b = C80342dg.m139300a().mo46674b(new C17508d(msgType, checkCode2, str, aiVar.getLocalExtValue("s:log_id")));
            if (b == null) {
                C89219l.m154715b();
            }
            m32517b("message_self_visiable", b);
        }
        return c.getCheckCode();
    }

    /* renamed from: b */
    private final void m32516b(String str) {
        MethodCollector.m26663i(7613);
        synchronized (this) {
            try {
                if (m32513a().size() >= 100) {
                    m32513a().remove(0);
                }
                m32513a().add(System.currentTimeMillis() + ":  " + str);
            } finally {
                MethodCollector.m26664o(7613);
            }
        }
    }

    /* renamed from: a */
    private static String m32512a(C19672u uVar) {
        return "IMError{" + uVar.f46728a + ", {" + uVar.f46729b + ", " + uVar.f46730c + "}, {" + uVar.f46731d + ", " + uVar.f46732e + "}, " + uVar.f46733f + '}';
    }

    /* renamed from: a */
    private final void m32514a(int i) {
        List<String> g;
        MethodCollector.m26663i(7452);
        if (i != 2 || this == null) {
            MethodCollector.m26664o(7452);
            return;
        }
        synchronized (this) {
            try {
                g = C89070n.m154585g((Collection) m32513a());
            } catch (Throwable th) {
                MethodCollector.m26664o(7452);
                throw th;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String str : g) {
            sb.append(str).append("\n");
            if (sb.length() > 800) {
                AbstractC17449b b = C17415a.m32255b();
                String sb2 = sb.toString();
                C89219l.m154716b(sb2, "");
                b.mo27838c("IMErrorMonitor", sb2);
                sb = new StringBuilder();
            }
        }
        AbstractC17449b b2 = C17415a.m32255b();
        String sb3 = sb.toString();
        C89219l.m154716b(sb3, "");
        b2.mo27838c("IMErrorMonitor", sb3);
        MethodCollector.m26664o(7452);
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1220j.AbstractC17469a
    /* renamed from: a */
    public final void mo27898a(C17470b bVar) {
        C89219l.m154721d(bVar, "");
        m32516b("ws state changed: ".concat(String.valueOf(bVar)));
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1220j.AbstractC17469a
    /* renamed from: a */
    public final void mo27897a(WsChannelMsg wsChannelMsg, C19608bd bdVar) {
        C89219l.m154721d(wsChannelMsg, "");
        C89219l.m154721d(wsChannelMsg, "");
    }

    /* renamed from: b */
    private static void m32517b(String str, String str2) {
        C17415a.m32255b().mo27836b("IMErrorMonitor", "feedback: " + str + ", " + str2);
        C17415a.m32255b().mo27840d(str, str2);
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1210a.AbstractC17417b
    /* renamed from: a */
    public final void mo27788a(EnumC17416a aVar, C17418c cVar) {
        String str;
        C89219l.m154721d(aVar, "");
        StringBuilder append = new StringBuilder("account changed: ").append(aVar).append(", ");
        if (cVar != null) {
            str = cVar.f41775a;
        } else {
            str = null;
        }
        m32516b(append.append(str).toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d5, code lost:
        if (r4 == 0) goto L_0x00a9;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m32515a(com.bytedance.p1399im.core.p1408d.C19538ai r5, com.bytedance.p1399im.core.p1408d.C19672u r6) {
        /*
        // Method dump skipped, instructions count: 285
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.p1208im.core.p1224e.C17551t.m32515a(com.bytedance.im.core.d.ai, com.bytedance.im.core.d.u):void");
    }
}
