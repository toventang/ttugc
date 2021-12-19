package okhttp3.internal;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import okhttp3.AbstractC90049e;
import okhttp3.C90017a;
import okhttp3.C90029ac;
import okhttp3.C90034ae;
import okhttp3.C90180j;
import okhttp3.C90182k;
import okhttp3.C90198s;
import okhttp3.C90208y;
import okhttp3.Request;
import okhttp3.internal.p4654b.C90076c;
import okhttp3.internal.p4654b.C90078d;
import okhttp3.internal.p4654b.C90082g;

/* renamed from: okhttp3.internal.a */
public abstract class AbstractC90058a {

    /* renamed from: a */
    public static AbstractC90058a f204330a;

    static {
        Covode.recordClassIndex(106230);
    }

    /* renamed from: a */
    public abstract int mo144781a(C90029ac.C90030a aVar);

    /* renamed from: a */
    public abstract IOException mo144782a(AbstractC90049e eVar, IOException iOException);

    /* renamed from: a */
    public abstract Socket mo144783a(C90180j jVar, C90017a aVar, C90082g gVar);

    /* renamed from: a */
    public abstract AbstractC90049e mo144784a(C90208y yVar, Request request);

    /* renamed from: a */
    public abstract C90076c mo144785a(C90180j jVar, C90017a aVar, C90082g gVar, C90034ae aeVar);

    /* renamed from: a */
    public abstract C90078d mo144786a(C90180j jVar);

    /* renamed from: a */
    public abstract C90082g mo144787a(AbstractC90049e eVar);

    /* renamed from: a */
    public abstract void mo144788a(C90182k kVar, SSLSocket sSLSocket, boolean z);

    /* renamed from: a */
    public abstract void mo144789a(C90198s.C90199a aVar, String str);

    /* renamed from: a */
    public abstract void mo144790a(C90198s.C90199a aVar, String str, String str2);

    /* renamed from: a */
    public abstract boolean mo144791a(C90017a aVar, C90017a aVar2);

    /* renamed from: a */
    public abstract boolean mo144792a(C90180j jVar, C90076c cVar);

    /* renamed from: b */
    public abstract void mo144793b(C90180j jVar, C90076c cVar);
}
