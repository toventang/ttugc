package com.p2082ss.ugc.effectplatform.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.C86762e;
import com.p2082ss.ugc.effectplatform.p4449f.C86782b;
import com.p2082ss.ugc.effectplatform.p4449f.C86783c;
import com.p2082ss.ugc.effectplatform.p4449f.C86784d;
import com.p2082ss.ugc.effectplatform.p4449f.C86785e;
import com.p2082ss.ugc.effectplatform.p4449f.C86786f;
import com.p2082ss.ugc.effectplatform.p4449f.C86787g;
import p4519d.p4520a.p4530d.p4531a.C88053j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.model.e */
public final class C86840e {

    /* renamed from: a */
    public int f195756a;

    /* renamed from: b */
    public String f195757b;

    /* renamed from: c */
    public Exception f195758c;

    /* renamed from: d */
    private String f195759d;

    /* renamed from: e */
    private String f195760e;

    /* renamed from: f */
    private String f195761f;

    static {
        Covode.recordClassIndex(102565);
    }

    public final String toString() {
        if (this.f195758c == null) {
            return "ExceptionResult{errorCode=" + this.f195756a + ", msg='" + this.f195757b + ", requestUrl='" + this.f195759d + '\'' + ", selectedHost='" + this.f195760e + '\'' + ", remoteIp='" + this.f195761f + '\'' + '}';
        }
        StringBuilder append = new StringBuilder("ExceptionResult{errorCode=").append(this.f195756a).append(", msg='").append(this.f195757b).append('\'').append(", requestUrl='").append(this.f195759d).append('\'').append(", selectedHost='").append(this.f195760e).append('\'').append(", remoteIp='").append(this.f195761f).append('\'').append(", exception=");
        Exception exc = this.f195758c;
        if (exc == null) {
            C89219l.m154707a();
        }
        return append.append(exc.getMessage()).append('}').toString();
    }

    public C86840e(Exception exc) {
        this(exc, (byte) 0);
    }

    public C86840e(int i) {
        this.f195756a = -1;
        this.f195756a = i;
        this.f195757b = C86762e.m150315a(i);
        this.f195758c = null;
    }

    public C86840e(int i, Exception exc) {
        this.f195756a = -1;
        this.f195756a = i;
        this.f195757b = C86762e.m150315a(i);
        this.f195758c = exc;
    }

    private C86840e(Exception exc, byte b) {
        int i;
        this.f195756a = -1;
        this.f195759d = null;
        this.f195760e = null;
        this.f195761f = null;
        this.f195758c = exc;
        if (exc instanceof C86784d) {
            this.f195756a = ((C86784d) exc).getStatus_code();
            this.f195757b = exc.getMessage();
        } else if (exc instanceof C86785e) {
            this.f195756a = ((C86785e) exc).getStatusCode();
            this.f195757b = exc.getMessage();
        } else if (exc instanceof C86782b) {
            this.f195756a = 10008;
            this.f195757b = exc.getMessage();
        } else if (exc instanceof C86787g) {
            this.f195756a = 10015;
            this.f195757b = exc.getMessage();
        } else if (exc instanceof C86786f) {
            this.f195756a = 10013;
            this.f195757b = exc.getMessage();
        } else if (exc instanceof C86783c) {
            this.f195756a = 10010;
            this.f195757b = exc.getMessage();
        } else if (exc instanceof C88053j) {
            this.f195756a = 10012;
            this.f195757b = exc.getMessage();
        } else if (exc != null) {
            if (C89219l.m154714a((Object) "network unavailable", (Object) exc.getMessage())) {
                i = 10011;
            } else {
                i = 10005;
            }
            this.f195756a = i;
            String message = exc.getMessage();
            this.f195757b = message;
            if (message == null || message.length() == 0) {
                this.f195757b = exc.toString();
            }
        } else {
            this.f195756a = 1;
            this.f195757b = C86762e.m150315a(1);
        }
    }

    /* renamed from: a */
    public final void mo140160a(String str, String str2, String str3) {
        this.f195759d = str;
        this.f195760e = str2;
        this.f195761f = str3;
    }
}
