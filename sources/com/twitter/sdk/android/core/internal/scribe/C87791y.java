package com.twitter.sdk.android.core.internal.scribe;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.twitter.sdk.android.core.internal.scribe.C87779r;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.y */
final /* synthetic */ class C87791y implements C87779r.AbstractC87783c {

    /* renamed from: a */
    private final boolean[] f199416a;

    /* renamed from: b */
    private final ByteArrayOutputStream f199417b;

    static {
        Covode.recordClassIndex(103789);
    }

    C87791y(boolean[] zArr, ByteArrayOutputStream byteArrayOutputStream) {
        this.f199416a = zArr;
        this.f199417b = byteArrayOutputStream;
    }

    @Override // com.twitter.sdk.android.core.internal.scribe.C87779r.AbstractC87783c
    /* renamed from: a */
    public final void mo142250a(InputStream inputStream, int i) {
        MethodCollector.m26663i(6684);
        boolean[] zArr = this.f199416a;
        ByteArrayOutputStream byteArrayOutputStream = this.f199417b;
        byte[] bArr = new byte[i];
        inputStream.read(bArr);
        if (zArr[0]) {
            byteArrayOutputStream.write(ScribeFilesSender.f199305a);
        } else {
            zArr[0] = true;
        }
        byteArrayOutputStream.write(bArr);
        MethodCollector.m26664o(6684);
    }
}
