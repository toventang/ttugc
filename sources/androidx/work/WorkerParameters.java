package androidx.work;

import android.net.Network;
import android.net.Uri;
import androidx.work.impl.utils.p076b.AbstractC1707a;
import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class WorkerParameters {

    /* renamed from: a */
    public UUID f5179a;

    /* renamed from: b */
    public C1597e f5180b;

    /* renamed from: c */
    public Set<String> f5181c;

    /* renamed from: d */
    public int f5182d;

    /* renamed from: e */
    public Executor f5183e;

    /* renamed from: f */
    public AbstractC1707a f5184f;

    /* renamed from: g */
    public AbstractC1718k f5185g;

    /* renamed from: h */
    private C1589a f5186h;

    /* renamed from: androidx.work.WorkerParameters$a */
    public static class C1589a {

        /* renamed from: a */
        public List<String> f5187a = Collections.emptyList();

        /* renamed from: b */
        public List<Uri> f5188b = Collections.emptyList();

        /* renamed from: c */
        public Network f5189c;

        static {
            Covode.recordClassIndex(1742);
        }
    }

    static {
        Covode.recordClassIndex(1741);
    }

    public WorkerParameters(UUID uuid, C1597e eVar, Collection<String> collection, C1589a aVar, int i, Executor executor, AbstractC1707a aVar2, AbstractC1718k kVar) {
        this.f5179a = uuid;
        this.f5180b = eVar;
        this.f5181c = new HashSet(collection);
        this.f5186h = aVar;
        this.f5182d = i;
        this.f5183e = executor;
        this.f5184f = aVar2;
        this.f5185g = kVar;
    }
}
