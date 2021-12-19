package com.bytedance.apm.agent.instrumentation.okhttp3;

import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.transaction.TransactionState;
import com.bytedance.covode.number.Covode;
import java.io.IOException;
import okhttp3.AbstractC90031ad;
import okhttp3.AbstractC90202u;
import okhttp3.C90029ac;
import okhttp3.C90204w;
import okhttp3.Request;
import p4632k.AbstractC89408aa;
import p4632k.AbstractC89426h;
import p4632k.AbstractC89431l;
import p4632k.C89420f;
import p4632k.C89436q;

public class InterceptorImpl implements AbstractC90202u {
    static {
        Covode.recordClassIndex(14043);
    }

    class ResponseBodyWrapper extends AbstractC90031ad {
        private AbstractC89426h bufferedSource;
        private final C90029ac response;
        private final AbstractC90031ad responseBody;
        public long totalBytesRead;
        private final TransactionState transactionState;

        static {
            Covode.recordClassIndex(14044);
        }

        @Override // okhttp3.AbstractC90031ad
        public long contentLength() {
            return this.responseBody.contentLength();
        }

        @Override // okhttp3.AbstractC90031ad
        public C90204w contentType() {
            return this.responseBody.contentType();
        }

        @Override // okhttp3.AbstractC90031ad, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.responseBody.close();
            end();
        }

        public void end() {
            if (!this.transactionState.isComplete()) {
                this.transactionState.setBytesReceived(this.totalBytesRead);
                MonitorRecorder.reportMonitorData(this.transactionState, this.response);
            }
        }

        @Override // okhttp3.AbstractC90031ad
        public AbstractC89426h source() {
            if (this.bufferedSource == null) {
                this.bufferedSource = C89436q.m155160a(source(this.responseBody.source()));
            }
            return this.bufferedSource;
        }

        private AbstractC89408aa source(AbstractC89408aa aaVar) {
            return new AbstractC89431l(aaVar) {
                /* class com.bytedance.apm.agent.instrumentation.okhttp3.InterceptorImpl.ResponseBodyWrapper.C122761 */

                static {
                    Covode.recordClassIndex(14045);
                }

                @Override // p4632k.AbstractC89408aa, java.io.Closeable, p4632k.AbstractC89431l, java.lang.AutoCloseable
                public void close() {
                    super.close();
                    ResponseBodyWrapper.this.end();
                }

                @Override // p4632k.AbstractC89408aa, p4632k.AbstractC89431l
                public long read(C89420f fVar, long j) {
                    long read = super.read(fVar, j);
                    if (read >= 0) {
                        ResponseBodyWrapper.this.totalBytesRead += read;
                    }
                    return read;
                }
            };
        }

        public ResponseBodyWrapper(C90029ac acVar, TransactionState transactionState2) {
            this.response = acVar;
            this.responseBody = acVar.f204111g;
            this.transactionState = transactionState2;
        }
    }

    @Override // okhttp3.AbstractC90202u
    public C90029ac intercept(AbstractC90202u.AbstractC90203a aVar) {
        Request a = aVar.mo144856a();
        String header = a.header("User-Agent");
        if (header != null && header.contains("tt")) {
            return aVar.mo144857a(a);
        }
        TransactionState transactionState = new TransactionState();
        MonitorRecorder.recordRequest(a, transactionState);
        try {
            C90029ac a2 = aVar.mo144857a(a);
            MonitorRecorder.recordResponse(a2, transactionState);
            if (transactionState.getReceivedBytes() >= 0 || TextUtils.isEmpty(a2.mo144718a("Transfer-Encoding", null))) {
                MonitorRecorder.reportMonitorData(transactionState, a2);
                return a2;
            }
            transactionState.addAssistData("Transfer-Encoding", a2.mo144718a("Transfer-Encoding", null));
            C90029ac.C90030a b = a2.mo144722b();
            b.f204124g = new ResponseBodyWrapper(a2, transactionState);
            return b.mo144729a();
        } catch (IOException e) {
            MonitorRecorder.reportExceptionMonitor(transactionState, e);
            throw e;
        }
    }
}
