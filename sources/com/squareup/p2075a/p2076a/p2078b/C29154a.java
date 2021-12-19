package com.squareup.p2075a.p2076a.p2078b;

import com.bytedance.covode.number.Covode;
import com.squareup.p2075a.AbstractC29209b;
import com.squareup.p2075a.C29223g;
import com.squareup.p2075a.C29230l;
import com.squareup.p2075a.C29237q;
import com.squareup.p2075a.C29246v;
import com.squareup.p2075a.C29249x;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.util.List;

/* renamed from: com.squareup.a.a.b.a */
public final class C29154a implements AbstractC29209b {

    /* renamed from: a */
    public static final AbstractC29209b f69005a = new C29154a();

    static {
        Covode.recordClassIndex(35503);
    }

    /* renamed from: a */
    private static InetAddress m58261a(Proxy proxy, C29237q qVar) {
        if (proxy == null || proxy.type() == Proxy.Type.DIRECT) {
            return InetAddress.getByName(qVar.f69286d);
        }
        return ((InetSocketAddress) proxy.address()).getAddress();
    }

    @Override // com.squareup.p2075a.AbstractC29209b
    /* renamed from: a */
    public final C29246v mo50854a(Proxy proxy, C29249x xVar) {
        PasswordAuthentication requestPasswordAuthentication;
        List<C29223g> b = xVar.mo51032b();
        C29246v vVar = xVar.f69350a;
        C29237q qVar = vVar.f69338a;
        int size = b.size();
        for (int i = 0; i < size; i++) {
            C29223g gVar = b.get(i);
            if ("Basic".equalsIgnoreCase(gVar.f69246a) && (requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(qVar.f69286d, m58261a(proxy, qVar), qVar.f69287e, qVar.f69283a, gVar.f69247b, gVar.f69246a, qVar.mo50988a(), Authenticator.RequestorType.SERVER)) != null) {
                return vVar.mo51018b().mo51024a("Authorization", C29230l.m58490a(requestPasswordAuthentication.getUserName(), new String(requestPasswordAuthentication.getPassword()))).mo51025a();
            }
        }
        return null;
    }

    @Override // com.squareup.p2075a.AbstractC29209b
    /* renamed from: b */
    public final C29246v mo50855b(Proxy proxy, C29249x xVar) {
        List<C29223g> b = xVar.mo51032b();
        C29246v vVar = xVar.f69350a;
        C29237q qVar = vVar.f69338a;
        int size = b.size();
        for (int i = 0; i < size; i++) {
            C29223g gVar = b.get(i);
            if ("Basic".equalsIgnoreCase(gVar.f69246a)) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) proxy.address();
                PasswordAuthentication requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(inetSocketAddress.getHostName(), m58261a(proxy, qVar), inetSocketAddress.getPort(), qVar.f69283a, gVar.f69247b, gVar.f69246a, qVar.mo50988a(), Authenticator.RequestorType.PROXY);
                if (requestPasswordAuthentication != null) {
                    return vVar.mo51018b().mo51024a("Proxy-Authorization", C29230l.m58490a(requestPasswordAuthentication.getUserName(), new String(requestPasswordAuthentication.getPassword()))).mo51025a();
                }
            }
        }
        return null;
    }
}
