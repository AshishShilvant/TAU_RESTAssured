package examples.JSONToXML;

import com.github.tomakehurst.wiremock.common.FileSource;
import com.github.tomakehurst.wiremock.extension.Parameters;
import com.github.tomakehurst.wiremock.extension.ResponseTransformer;
import com.github.tomakehurst.wiremock.http.Request;
import com.github.tomakehurst.wiremock.http.Response;

public class JsonToXmlTransformer extends ResponseTransformer {


    @Override
    public Response transform(Request request, Response response, FileSource fileSource, Parameters parameters) {
        return null;
    }

    @Override
    public String getName() {
        return "";
    }
}
