import { createStandaloneToast } from '@chakra-ui/react'

const { toast } = createStandaloneToast()

const notification = (title, description, status) => {
    toast({
        title,
        description,
        status,
        isClosable:true,
        duration: 4000,
        position: 'top'
    })
}

export const successNotification = (title, description) => {
    notification(
        title,
        description,
        "success"
    )
}

export const errorNotification = (title, description) => {
    notification(
        title,
        description,
        "error"
    )
}