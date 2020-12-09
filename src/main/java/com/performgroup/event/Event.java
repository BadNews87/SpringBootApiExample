package com.performgroup.event;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Event {

    @Id
    private Long event_id;
    private String uuid;
    private Long match_id;
    private Long people_id;
    private Long team_id;
    private Long team_people_id;
    private Long rel_event_id;
    private Long period_event_id;
    private Double pos_x;
    private Double pos_y;
    private String eventtype;
    private Long game_minute;
    private Double game_second;
    private java.sql.Timestamp event_update_datetime;
    private Long shirtnumber;

    public Event() {
    }

    public Event(Long event_id, String eventtype) {
        this.event_id = event_id;
        this.eventtype = eventtype;
    }

    public Long getEvent_id() {
        return event_id;
    }

    public void setEvent_id(Long event_id) {
        this.event_id = event_id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Long getMatch_id() {
        return match_id;
    }

    public void setMatch_id(Long match_id) {
        this.match_id = match_id;
    }

    public Long getPeople_id() {
        return people_id;
    }

    public void setPeople_id(Long people_id) {
        this.people_id = people_id;
    }

    public Long getTeam_id() {
        return team_id;
    }

    public void setTeam_id(Long team_id) {
        this.team_id = team_id;
    }

    public Long getTeam_people_id() {
        return team_people_id;
    }

    public void setTeam_people_id(Long team_people_id) {
        this.team_people_id = team_people_id;
    }

    public Long getRel_event_id() {
        return rel_event_id;
    }

    public void setRel_event_id(Long rel_event_id) {
        this.rel_event_id = rel_event_id;
    }

    public Long getPeriod_event_id() {
        return period_event_id;
    }

    public void setPeriod_event_id(Long period_event_id) {
        this.period_event_id = period_event_id;
    }

    public Double getPos_x() {
        return pos_x;
    }

    public void setPos_x(Double pos_x) {
        this.pos_x = pos_x;
    }

    public Double getPos_y() {
        return pos_y;
    }

    public void setPos_y(Double pos_y) {
        this.pos_y = pos_y;
    }

    public String getEventtype() {
        return eventtype;
    }

    public void setEventtype(String eventtype) {
        this.eventtype = eventtype;
    }

    public Long getGame_minute() {
        return game_minute;
    }

    public void setGame_minute(Long game_minute) {
        this.game_minute = game_minute;
    }

    public Double getGame_second() {
        return game_second;
    }

    public void setGame_second(Double game_second) {
        this.game_second = game_second;
    }

    public java.sql.Timestamp getEvent_update_datetime() {
        return event_update_datetime;
    }

    public void setEvent_update_datetime(java.sql.Timestamp event_update_datetime) {
        this.event_update_datetime = event_update_datetime;
    }

    public Long getShirtnumber() {
        return shirtnumber;
    }

    public void setShirtnumber(Long shirtnumber) {
        this.shirtnumber = shirtnumber;
    }
}
