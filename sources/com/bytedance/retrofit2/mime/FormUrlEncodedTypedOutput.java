package com.bytedance.retrofit2.mime;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.usermgmt.StringSet;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;

public final class FormUrlEncodedTypedOutput implements TypedOutput {
    final ByteArrayOutputStream content = new ByteArrayOutputStream();

    static {
        Covode.recordClassIndex(25751);
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final String fileName() {
        return null;
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final String mimeType() {
        return "application/x-www-form-urlencoded; charset=UTF-8";
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final long length() {
        return (long) this.content.size();
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final String md5Stub() {
        return DigestUtil.md5Hex(this.content.toByteArray());
    }

    public FormUrlEncodedTypedOutput() {
        MethodCollector.m26663i(10921);
        MethodCollector.m26664o(10921);
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final void writeTo(OutputStream outputStream) {
        MethodCollector.m26663i(11521);
        outputStream.write(this.content.toByteArray());
        MethodCollector.m26664o(11521);
    }

    public final void addField(String str, String str2) {
        addField(str, true, str2, true);
    }

    public final void addField(String str, boolean z, String str2, boolean z2) {
        MethodCollector.m26663i(11212);
        if (str == null) {
            NullPointerException nullPointerException = new NullPointerException(StringSet.name);
            MethodCollector.m26664o(11212);
            throw nullPointerException;
        } else if (str2 != null) {
            if (this.content.size() > 0) {
                this.content.write(38);
            }
            if (z) {
                try {
                    str = URLEncoder.encode(str, "UTF-8");
                } catch (IOException e) {
                    RuntimeException runtimeException = new RuntimeException(e);
                    MethodCollector.m26664o(11212);
                    throw runtimeException;
                }
            }
            if (z2) {
                str2 = URLEncoder.encode(str2, "UTF-8");
            }
            this.content.write(str.getBytes("UTF-8"));
            this.content.write(61);
            this.content.write(str2.getBytes("UTF-8"));
            MethodCollector.m26664o(11212);
        } else {
            NullPointerException nullPointerException2 = new NullPointerException("value");
            MethodCollector.m26664o(11212);
            throw nullPointerException2;
        }
    }
}
