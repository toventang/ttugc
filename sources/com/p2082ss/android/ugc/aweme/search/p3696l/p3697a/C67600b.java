package com.p2082ss.android.ugc.aweme.search.p3696l.p3697a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14652c;
import com.bytedance.frameworks.baselib.network.http.p983b.C14621d;
import com.google.gson.p2020c.C27901d;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.C34480a;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.p3698a.C67598e;
import java.io.IOException;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.search.l.a.b */
public final class C67600b {

    /* renamed from: a */
    public static final C67600b f151414a = new C67600b();

    private C67600b() {
    }

    static {
        Covode.recordClassIndex(79239);
    }

    /* renamed from: a */
    public static void m119709a(C67598e eVar, Throwable th) {
        Class<?> cls;
        String message;
        C89219l.m154721d(eVar, "");
        if (th instanceof C14621d) {
            eVar.mo106567a(2);
            eVar.mo106573b(1);
            eVar.mo106571a(th.getMessage());
        } else if (th instanceof C14652c) {
            int statusCode = ((C14652c) th).getStatusCode();
            if (statusCode > 0) {
                eVar.mo106567a(3);
                eVar.mo106573b(statusCode);
            } else {
                eVar.mo106567a(2);
                eVar.mo106573b(100);
            }
            String message2 = th.getMessage();
            if (message2 != null) {
                StringBuilder append = new StringBuilder("(").append(statusCode).append(')');
                int c = C89271h.m154772c(message2.length(), 100);
                Objects.requireNonNull(message2, "null cannot be cast to non-null type java.lang.String");
                String substring = message2.substring(0, c);
                C89219l.m154716b(substring, "");
                eVar.mo106571a(append.append(substring).toString());
                if (C89361p.m154929e((CharSequence) message2, (CharSequence) "PROXY_CONNECTION_FAILED")) {
                    eVar.mo106573b(2);
                } else if (C89361p.m154929e((CharSequence) message2, (CharSequence) "HTTP2_PROTOCOL_ERROR")) {
                    eVar.mo106573b(3);
                } else if (C89361p.m154929e((CharSequence) message2, (CharSequence) "TTNET_APP_TIMED_OUT")) {
                    eVar.mo106573b(4);
                }
            }
        } else {
            if (th != null) {
                cls = th.getClass();
            } else {
                cls = null;
            }
            if (C89219l.m154714a(cls, IOException.class)) {
                String message3 = th.getMessage();
                if (message3 != null) {
                    if (C89361p.m154929e((CharSequence) message3, (CharSequence) "missing CR")) {
                        eVar.mo106567a(4);
                        eVar.mo106573b(3);
                    } else if (C89361p.m154929e((CharSequence) message3, (CharSequence) "Premature EOF")) {
                        eVar.mo106567a(4);
                        eVar.mo106573b(2);
                    } else {
                        eVar.mo106567a(2);
                        eVar.mo106573b(101);
                    }
                }
                eVar.mo106571a(th.getMessage());
            } else if (th instanceof C27901d) {
                eVar.mo106567a(4);
                eVar.mo106573b(1);
                eVar.mo106571a(th.getMessage());
            } else if (th instanceof C34485a) {
                eVar.mo106567a(5);
                eVar.mo106573b(((C34480a) th).getErrorCode());
                eVar.mo106571a(th.getMessage());
            } else {
                eVar.mo106567a(2);
                if (th != null && (message = th.getMessage()) != null) {
                    StringBuilder append2 = new StringBuilder().append(th.getClass().getName()).append('(');
                    int c2 = C89271h.m154772c(message.length(), 100);
                    Objects.requireNonNull(message, "null cannot be cast to non-null type java.lang.String");
                    String substring2 = message.substring(0, c2);
                    C89219l.m154716b(substring2, "");
                    String sb = append2.append(substring2).append(')').toString();
                    eVar.mo106571a(sb);
                    if (C89361p.m154929e((CharSequence) sb, (CharSequence) "TTNET_APP_TIMED_OUT")) {
                        eVar.mo106567a(4);
                    }
                }
            }
        }
    }
}
