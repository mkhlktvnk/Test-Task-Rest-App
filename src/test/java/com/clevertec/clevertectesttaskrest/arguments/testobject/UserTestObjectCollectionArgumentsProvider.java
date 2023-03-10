package com.clevertec.clevertectesttaskrest.arguments.testobject;

import com.clevertec.clevertectesttaskrest.testobject.ContactTestObject;
import com.clevertec.clevertectesttaskrest.testobject.UserTestObject;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class UserTestObjectCollectionArgumentsProvider implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
        return Stream.of(
                Arguments.of(Set.of(
                        UserTestObject.builder().id(1L).username("username-1").contacts(Set.of(
                                ContactTestObject.builder().id(1L).phone("123123").build(),
                                ContactTestObject.builder().id(2L).phone("123123").build(),
                                ContactTestObject.builder().id(3L).phone("123123").build(),
                                ContactTestObject.builder().id(4L).phone("123123").build(),
                                ContactTestObject.builder().id(5L).phone("123123").build()
                        )).build()
                )),
                Arguments.of(List.of(
                        UserTestObject.builder().id(2L).username("username-2").contacts(Set.of(
                                ContactTestObject.builder().id(1L).phone("123123").build(),
                                ContactTestObject.builder().id(2L).phone("123123").build(),
                                ContactTestObject.builder().id(3L).phone("123123").build(),
                                ContactTestObject.builder().id(4L).phone("123123").build(),
                                ContactTestObject.builder().id(5L).phone("123123").build()
                        )).build()
                )),
                Arguments.of(Set.of(
                        UserTestObject.builder().id(3L).username("username-3").contacts(Set.of(
                                ContactTestObject.builder().id(1L).phone("123123").build(),
                                ContactTestObject.builder().id(2L).phone("123123").build(),
                                ContactTestObject.builder().id(3L).phone("123123").build(),
                                ContactTestObject.builder().id(4L).phone("123123").build(),
                                ContactTestObject.builder().id(5L).phone("123123").build()
                        )).build()
                )),
                Arguments.of(List.of(
                        UserTestObject.builder().id(3L).username("username-4").contacts(Set.of(
                                ContactTestObject.builder().id(1L).phone("123123").build(),
                                ContactTestObject.builder().id(2L).phone("123123").build(),
                                ContactTestObject.builder().id(3L).phone("123123").build(),
                                ContactTestObject.builder().id(4L).phone("123123").build(),
                                ContactTestObject.builder().id(5L).phone("123123").build()
                        )).build()
                )),
                Arguments.of(Set.of(
                        UserTestObject.builder().id(3L).username("username-5").contacts(Set.of(
                                ContactTestObject.builder().id(1L).phone("123123").build(),
                                ContactTestObject.builder().id(2L).phone("123123").build(),
                                ContactTestObject.builder().id(3L).phone("123123").build(),
                                ContactTestObject.builder().id(4L).phone("123123").build(),
                                ContactTestObject.builder().id(5L).phone("123123").build()
                        )).build()
                )),
                Arguments.of(List.of(
                        UserTestObject.builder().id(3L).username("username-6").contacts(Set.of(
                                ContactTestObject.builder().id(1L).phone("123123").build(),
                                ContactTestObject.builder().id(2L).phone("123123").build(),
                                ContactTestObject.builder().id(3L).phone("123123").build(),
                                ContactTestObject.builder().id(4L).phone("123123").build(),
                                ContactTestObject.builder().id(5L).phone("123123").build()
                        )).build()
                )),
                Arguments.of(Set.of(
                        UserTestObject.builder().id(3L).username("username-7").contacts(Set.of(
                                ContactTestObject.builder().id(1L).phone("123123").build(),
                                ContactTestObject.builder().id(2L).phone("123123").build(),
                                ContactTestObject.builder().id(3L).phone("123123").build(),
                                ContactTestObject.builder().id(4L).phone("123123").build(),
                                ContactTestObject.builder().id(5L).phone("123123").build()
                        )).build()
                )),
                Arguments.of(List.of(
                        UserTestObject.builder().id(3L).username("username-8").contacts(Set.of(
                                ContactTestObject.builder().id(1L).phone("123123").build(),
                                ContactTestObject.builder().id(2L).phone("123123").build(),
                                ContactTestObject.builder().id(3L).phone("123123").build(),
                                ContactTestObject.builder().id(4L).phone("123123").build(),
                                ContactTestObject.builder().id(5L).phone("123123").build()
                        )).build()
                )),
                Arguments.of(Set.of(
                        UserTestObject.builder().id(3L).username("username-9").contacts(Set.of(
                                ContactTestObject.builder().id(1L).phone("123123").build(),
                                ContactTestObject.builder().id(2L).phone("123123").build(),
                                ContactTestObject.builder().id(3L).phone("123123").build(),
                                ContactTestObject.builder().id(4L).phone("123123").build(),
                                ContactTestObject.builder().id(5L).phone("123123").build()
                        )).build()
                )),
                Arguments.of(Set.of(
                        UserTestObject.builder().id(3L).username("username-10").contacts(Set.of(
                                ContactTestObject.builder().id(1L).phone("123123").build(),
                                ContactTestObject.builder().id(2L).phone("123123").build(),
                                ContactTestObject.builder().id(3L).phone("123123").build(),
                                ContactTestObject.builder().id(4L).phone("123123").build(),
                                ContactTestObject.builder().id(5L).phone("123123").build()
                        )).build()
                ))
        );
    }
}
