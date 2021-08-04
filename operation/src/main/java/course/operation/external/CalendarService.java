package course.operation.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name="supporting", url="http://supporting:8080")
public interface CalendarService {
    @RequestMapping(method= RequestMethod.GET, path="/calendars/{id}")
    public Calendar getCalendar(@PathVariable("id") Long id);

}

