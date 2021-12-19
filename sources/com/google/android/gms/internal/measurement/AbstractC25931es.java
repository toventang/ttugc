package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.AbstractC25930er;
import com.google.android.gms.internal.measurement.AbstractC25931es;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.es */
public abstract class AbstractC25931es<MessageType extends AbstractC25931es<MessageType, BuilderType>, BuilderType extends AbstractC25930er<MessageType, BuilderType>> implements AbstractC26020hq {
    protected int zza;

    static {
        Covode.recordClassIndex(31346);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo42365i() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26020hq
    /* renamed from: g */
    public final AbstractC25943fb mo42363g() {
        try {
            C25952fk b = AbstractC25943fb.m50229b(mo42621m());
            mo42616a(b.f61120a);
            return b.mo42426a();
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException(new StringBuilder(String.valueOf(name).length() + 62 + "ByteString".length()).append("Serializing ").append(name).append(" to a ").append("ByteString").append(" threw an IOException (should never happen).").toString(), e);
        }
    }

    /* renamed from: h */
    public final byte[] mo42364h() {
        try {
            byte[] bArr = new byte[mo42621m()];
            AbstractC25958fq a = AbstractC25958fq.m50367a(bArr);
            mo42616a(a);
            a.mo42515b();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException(new StringBuilder(String.valueOf(name).length() + 62 + "byte array".length()).append("Serializing ").append(name).append(" to a ").append("byte array").append(" threw an IOException (should never happen).").toString(), e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo42362b(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    protected static <T> void m50179a(Iterable<T> iterable, List<? super T> list) {
        C25989gm.m50599a(iterable);
        if (iterable instanceof AbstractC26005hb) {
            List<?> d = ((AbstractC26005hb) iterable).mo42653d();
            AbstractC26005hb hbVar = (AbstractC26005hb) list;
            int size = list.size();
            for (Object obj : d) {
                if (obj == null) {
                    String sb = new StringBuilder(37).append("Element at index ").append(hbVar.size() - size).append(" is null.").toString();
                    for (int size2 = hbVar.size() - 1; size2 >= size; size2--) {
                        hbVar.remove(size2);
                    }
                    throw new NullPointerException(sb);
                } else if (obj instanceof AbstractC25943fb) {
                    hbVar.mo42651a((AbstractC25943fb) obj);
                } else {
                    hbVar.add(obj);
                }
            }
        } else if (iterable instanceof AbstractC26033ic) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (T t : iterable) {
                if (t == null) {
                    String sb2 = new StringBuilder(37).append("Element at index ").append(list.size() - size3).append(" is null.").toString();
                    for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                        list.remove(size4);
                    }
                    throw new NullPointerException(sb2);
                }
                list.add(t);
            }
        }
    }
}
